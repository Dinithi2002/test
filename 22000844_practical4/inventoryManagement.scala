object inventoryManagement{
    def displayInventory(itemName: Array[String], itemQuantities: Array[Int]): Unit ={
        if(itemName.length != itemQuantities.length){
            println("Error: The lengths of item names and item quantities do not match.")
            return
        }

        println("All items and  quantities ....")
        for(i <- itemName.indices){
            println(s"${itemName(i)}: ${itemQuantities(i)}")
        }
    }

    def restockItem(itemName: Array[String], itemQuantities: Array[Int], item: String, quantity: Int): Unit = {
        val index = itemName.indexOf(item)
        if(index != -1){
            itemQuantities(index) += quantity
            println(s"\n\n$quantity units of $item added to the stock.")
        } else{
            println(s"Item '$item' does not exist in the inventory.")
        }
    }

    def sellItem(itemName: Array[String], itemQuantities: Array[Int], item: String, quantity: Int): Unit = {
        val index = itemName.indexOf(item)
        if(index != -1){
            if(itemQuantities(index) >= quantity){
                itemQuantities(index) -= quantity
                println(s"\n\n$quantity units of $item sold.")
            }
            else{
                println(s"Not enough stock of $item to sell $quantity units.")
            }
        }
        else{
            println(s"Item '$item' does not exist in the inventory.")
        }
    }


    def main(args: Array[String]): Unit ={
        val itemName = Array("Apple", "Mango", "Orange", "Banana", "Grapes")
        val itemQuantities= Array(10, 12, 5, 20, 8)

        displayInventory(itemName, itemQuantities)

        //restocking items
        restockItem(itemName, itemQuantities, "Apple", 3)
        restockItem(itemName, itemQuantities, "Watermelon", 2)

        displayInventory(itemName, itemQuantities)

        //selling items
        sellItem(itemName, itemQuantities, "Mango", 3)
        sellItem(itemName, itemQuantities, "Grapes", 10)

        displayInventory(itemName, itemQuantities)

    }
}