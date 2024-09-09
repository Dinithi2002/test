class Rational2(n: Int, d: Int) {
  require(d != 0, "Denominator must be non-zero")


  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def neg: Rational2 = new Rational2(-numer, denom)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def +(that: Rational2): Rational2 =
    new Rational2(
      this.numer * that.denom + that.numer * this.denom,
      this.denom * that.denom
    )

  override def toString: String = s"$numer/$denom"
}

object RationalTest extends App {

  val x = new Rational2(4, 416)
  val y = new Rational2(2, 5)


  println(s"x: $x")        
  println(s"y: $y")        

  println(s"-x: ${x.neg}") 

  val sum = x + y
  println(s"x + y: $sum")  
}
