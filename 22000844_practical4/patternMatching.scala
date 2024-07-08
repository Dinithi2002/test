object patternMatching{
    def main(args:Array[String]):Unit={
        val number = args(0).toInt;
        println(checkInteger(number));
    }

    def checkInteger(num:Int):String = num match {
        case x if x <= 0 => "Negative/Zero"
        case x if x % 2 == 0 => "Even number"
        case _ => "Odd number"
    }
}