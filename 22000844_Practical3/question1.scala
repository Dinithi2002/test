object question1 {
    def main(args: Array[String]): Unit = {
    val x = "Apple"
    val result = reverse(x)
    println(x +  " => " +  result)
  }

  def reverse(word: String): String = {
    if (word.isEmpty) ""
    else reverse(word.tail) + word.head
  }

}