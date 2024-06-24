object que4{
    def main(args:Array[String]){
        println(profit(5), profit(10), profit(15),profit(20))
        print(profit(25), profit(30), profit(35),profit(40))
    }

    def attendees(price:Int):Int=120+(15-price)/5*20
    def revenue(price:Int):Int = attendees(price)*price
    def cost(price:Int):Int=500+attendees(price)
    def profit(price:Int):Int =revenue(price)- cost(price)

}