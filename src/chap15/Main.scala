package chap15

object Main {

  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3)))
    println(sum(List("a", "bc", "def")))
  }

  /**
   * 暗黙のパラメータ
   */
  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))

}