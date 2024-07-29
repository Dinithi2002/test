object InventorySystem {
  // Sample inventories
  val inventory1: Map[Int, (String, Int, Double)] = Map(
    101 -> ("ProductA", 50, 25.0),
    102 -> ("ProductB", 30, 40.0),
    103 -> ("ProductC", 20, 15.0)
  )

  val inventory2: Map[Int, (String, Int, Double)] = Map(
    102 -> ("ProductB", 10, 45.0),
    104 -> ("ProductD", 5, 55.0)
  )

  def main(args: Array[String]): Unit = {
    println("(1)  All product names from inventory1: " + retrieveAllProductNames(inventory1))
    println("(2)  Total value of all products in inventory1: " + calculateTotalValue(inventory1))
    println("(3)  Is inventory1 empty? " + isInventoryEmpty(inventory1))
    println("(4)  Merged inventories: " + mergeInventories(inventory1, inventory2))
    println("(5)  Checking product details for product ID 102:")
    checkAndPrintProductDetails(inventory1, 102)
  }


  // 1 Retrieve all product names from inventory1
  def retrieveAllProductNames(inventory: Map[Int, (String, Int, Double)]): List[String] = {
    inventory.values.map(_._1).toList
  }

  // 2 Calculate the total value of all products in inventory1
  def calculateTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
    inventory.values.map { case (_, quantity, price) => quantity * price }.sum
  }

  // 3 Check if inventory1 is empty
  def isInventoryEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
    inventory.isEmpty
  }

  // 4 Merge inventory1 and inventory2, updating quantities and retaining the highest price
  def mergeInventories(
  inventory1: Map[Int, (String, Int, Double)],
  inventory2: Map[Int, (String, Int, Double)]
): Map[Int, (String, Int, Double)] = {
  val combinedInventories = inventory1 ++ inventory2.map { case (id, product) =>
    id -> inventory1.get(id).map { case (name, qty, price) =>
      (name, qty + product._2, Math.max(price, product._3))
    }.getOrElse(product)
  }
  combinedInventories
}

  // 5 Check if a product with a specific ID exists and print its details
  def checkAndPrintProductDetails(inventory: Map[Int, (String, Int, Double)], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some((name, quantity, price)) => println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
      case None => println(s"Product ID: $productId does not exist in the inventory.")
    }
  }
}


