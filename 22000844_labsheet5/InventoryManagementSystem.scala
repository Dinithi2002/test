object InventoryManagementSystem {

    def main(args: Array[String]): Unit = {
    val productList = getProductList()
    println("\nList of Products:")
    printProductList(productList)
    println(s"\nTotal number of products entered: ${getTotalProducts(productList)}")
  }

  
  def getProductList(acc: List[String] = Nil): List[String] = {
    println("Enter a product name (To finish, type=> done): ")
    val getInput = scala.io.StdIn.readLine().trim
    if (getInput.toLowerCase == "done") {
      acc.reverse 
    } else {
      getProductList(getInput :: acc) 
    }
  }

  def printProductList(products: List[String]): Unit = {
    def printWithIndex(products: List[String], index: Int = 1): Unit = {
      products match {
        case Nil =>
        case head :: tail =>
          println(s"$index. $head")
          printWithIndex(tail, index + 1)
      }
    }
    printWithIndex(products)
  }

  
  def getTotalProducts(products: List[String]): Int = {
    def count(products: List[String], acc: Int = 0): Int = {
      products match {
        case Nil => acc
        case _ :: tail => count(tail, acc + 1)
      }
    }
    count(products)
  }

}
