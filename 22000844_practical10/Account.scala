class Account(var balance: Double) {

 
  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $$${amount}. New balance: $$${balance}")
    } else {
      println("Deposit amount must be positive")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $$${amount}. New balance: $$${balance}")
    } else if (amount > balance) {
      println("Insufficient funds")
    } else {
      println("Withdrawal amount must be positive")
    }
  }

  def transfer(to: Account, amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      this.withdraw(amount)
      to.deposit(amount)
      println(s"Transferred $$${amount} to account. Your new balance is $$${balance}")
    } else if (amount > balance) {
      println("Insufficient funds for transfer")
    } else {
      println("Transfer amount must be positive")
    }
  }

  override def toString: String = f"Current balance: $$${balance}%.2f"
}

object AccountTest extends App {
  val account1 = new Account(800.00)
  val account2 = new Account(600.00)

  account1.deposit(250.00)

  account1.withdraw(200.00)

  account1.transfer(account2, 300.00)

  println(s"Account 1: ${account1}")
  println(s"Account 2: ${account2}")
}
