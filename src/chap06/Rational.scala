package chap06

/**
 * 有理数
 */
class Rational(n: Int, d: Int) {
  /** xとyの最大公約数を求める。  */
  private def gcd(x: Int, y: Int): Int = {
      if (x == 0) y
      else if (x < 0) gcd(-x, y)
      else if (y < 0) -gcd(x, -y)
      else gcd(y % x, x)
  }

  private val g = gcd(n, d)
  /** 約分された分子 */
  val numer: Int = n/g
  /** 約分された分母 */
  val denom: Int = d/g

  def +(that: Rational) =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def -(that: Rational) =
    new Rational(numer * that.denom - that.numer * denom, denom * that.denom)

  def *(that: Rational) =
    new Rational(numer * that.numer, denom * that.denom)

  def /(that: Rational) =
    new Rational(numer * that.denom, denom * that.numer)

  override def toString(): String = "%d/%d".format(this.numer, this.denom)
}