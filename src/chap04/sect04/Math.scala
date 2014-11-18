package chap04.sect04

object Math {

  def main(args: Array[String]): Unit = {
    println(sqrt(2))
    println(sqrt(4))
  }

  /** 2乗 */
  def square(x: Double) = x * x
  /** 絶対値 */
  def abs(x: Double) = if (x >= 0) x else -x

  /** 平方根 */
  def sqrt(x: Double) = {
    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)
    def improve(guess: Double, x: Double): Double = (guess + x / guess) / 2
    def isGoodEnough(guess: Double, x: Double): Boolean = abs(square(guess) - x) < 0.001

    sqrtIter(1.0, x)
  }

}