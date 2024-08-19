object InterestCalculator {
    def main(args:Array[String]):Unit ={
    val interest = (deposit:Double) => {
        if (deposit <= 20000) {
            (deposit* 0.02)
        } else if(deposit <= 200000){
            deposit*0.04
        } else if(deposit <= 2000000){
            deposit*0.035
        }else{
            deposit* 0.065
        }
    }

    println("Interest of 15000   : Rs. " + interest(15000))
    println("Interest of 50000   : Rs. " + interest(50000))
    println("Interest of 1500000 : Rs. " + interest(1500000))
    println("Interest of 2500000 : Rs. " + interest(2500000))
    }
}
