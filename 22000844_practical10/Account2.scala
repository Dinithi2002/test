class Account2(var balance: Double) {

  def deposit(amount: Double): Unit = {
    if (amount > 0) balance += amount
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) balance -= amount
    else if (amount > balance) println("Insufficient funds for withdrawal")
  }

  def transfer(to: Account2, amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      this.withdraw(amount)
      to.deposit(amount)
    } else {
      println("Insufficient funds for transfer")
    }
  }

  def applyInterest(): Unit = {
    if (balance > 0) balance += balance * 0.05   
    else balance += balance * 0.10              
  }

  override def toString: String = f"Account(balance: $$${balance}%.2f)"
}

class Bank(var accounts: List[Account2]) {

  def accountsWithNegativeBalances(): List[Account2] = {
    accounts.filter(_.balance < 0)
  }

  def totalBalance(): Double = {
    accounts.map(_.balance).sum
  }

  def applyInterestToAllAccounts(): Unit = {
    accounts.foreach(_.applyInterest())
  }

  def displayAccounts(): Unit = {
    accounts.foreach(println)
  }
}

object BankTest extends App {
  val acc1 = new Account2(800.00)
  val acc2 = new Account2(-250.00)
  val acc3 = new Account2(200.00)
  val acc4 = new Account2(-100.00)

  val bank = new Bank(List(acc1, acc2, acc3, acc4))

  println("Accounts with negative balances:")
  bank.accountsWithNegativeBalances().foreach(println)

  println(f"Total balance of all accounts: $$${bank.totalBalance()}%.2f")

  bank.applyInterestToAllAccounts()

  println("\nFinal balances after applying interest:")
  bank.displayAccounts()
}
