package chap05.sect02

object Math0502 {

  def main(args: Array[String]): Unit = {

    val sumInts2 = sum(x => x) _
    val sumSquares2 = sum(x => x * x) _
    val sumPowersOfTwo2 = sum(powerOfTwo) _

    println(sumSquares(1, 10) + sumPowersOfTwo(10, 20))// 2096513
    println(sumSquares2(1, 10) + sumPowersOfTwo2(10, 20))// 2096513
  }

  /** 2のx乗 */
  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)

  def sumInts = sum(x => x) _
  def sumSquares = sum(x => x * x) _
  def sumPowersOfTwo = sum(powerOfTwo) _
}