class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator must be non-zero")

  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g


  def neg: Rational = new Rational(-numer, denom)


  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)


  override def toString: String = s"$numer/$denom"
}

object RationalTest extends App {
  val x = new Rational(3,243 )
  println(s"x: $x")         
  println(s"-x: ${x.neg}")  
}
