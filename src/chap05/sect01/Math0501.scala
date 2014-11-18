package chap05.sect01

object Math0501 {

  def main(args: Array[String]): Unit = {
    println(sumSquares(1, 10) + sumPowersOfTwo(10, 20))

  }

  /** 2のx乗 */
  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int = sum(x => x, a, b)

  def sumSquares(a: Int, b: Int): Int = sum(x => x * x, a, b)

  def sumPowersOfTwo(a: Int, b: Int): Int = sum(powerOfTwo, a, b)
}