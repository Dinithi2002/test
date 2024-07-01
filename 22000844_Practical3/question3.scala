object question3{
    def main(args:Array[String]){
        var num1 = 5
        var num2 = 6
        var avg2 = average(num1,num2)
        println(f"Average of $num1 and $num2 = $avg2%.2f")
    }

    def average(num1: Int, num2: Int): Float = {
    val avg: Float = (num1 + num2) / 2.0f

    def roundToTwoDecimals(value: Float, places: Int): Float = {
      if (places == 0) value
      else {
        val scaledValue = (value * 100).toInt
        roundToTwoDecimals(scaledValue / 100.0f, places - 1)
      }
    }

    roundToTwoDecimals(avg, 2)
  }
}