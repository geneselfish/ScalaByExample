package chap08.sect05

/**
 * タプル
 */
object Main {

  def main(args: Array[String]): Unit = {
    val (x, y) = divmod(5, 3)
    println("商は%d、余りは%d".format(x, y))
  }

  def divmod(x: Int, y: Int): (Int, Int) = (x / y, x % y)

}