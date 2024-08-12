object NumberCategorizer {

  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      println("Please provide an integer input.")
      System.exit(1)
    }


    val input = args(0).toInt


    val isMultipleOf: (Int, Int) => Boolean = (number, divisor) => number % divisor == 0


    val result = input match {
      case n if isMultipleOf(n, 3) && isMultipleOf(n, 5) => "Multiple of Both Three and Five"
      case n if isMultipleOf(n, 3) => "Multiple of Three"
      case n if isMultipleOf(n, 5) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(result)
  }
}
