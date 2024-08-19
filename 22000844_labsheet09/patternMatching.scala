object patternMatching{
    def main(args: Array[String]):Unit = {
        val checkNum:Int => String = (number: Int) => number match{
            case n if n<= 0 => "Negative/Zero is input"
            case n if n%2 == 0  => "Even number is given"
            case _ => "Odd number is given"
        }

        if (args.length >0){
            val input = args(0).toInt
            println(checkNum(input))
        }else{
            println("Enter an Integer!!!")
        }
    }
}