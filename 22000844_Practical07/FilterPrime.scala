object FilterPrime {
    def isPrime(number: Int): Boolean = {
      if (number <= 1) false
      else if (number == 2) true
      else !(2 to Math.sqrt(number).toInt).exists(i => number % i == 0)
    }
  
    def filterPrime(numbers: List[Int]): List[Int] = {
      numbers.filter(isPrime)
    }
  
    def main(args: Array[String]): Unit = {
      val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
      val output = filterPrime(input)
      println(output)  
    }
  }
  