package chap15

object Main {

  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3)))
    println(sum(List("a", "bc", "def")))

    val list = List(5, 4, 3, 2, 1)
//    val result = sort(list)//コンパイルエラーになる！何故？
//    println(result)
  }

  /**
   * 暗黙のパラメータ
   */
  def sum[A](xs: List[A])(implicit m: Monoid[A]): A =
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))

  /**
   * 暗黙の型変換
   */
  def sort[A <% Ordered[A]](xs: List[A]): List[A] =
    if (xs.isEmpty || xs.tail.isEmpty) xs
    else {
      val (ys, zs) = xs.splitAt(xs.length / 2)
      merge(ys, zs)
   }

  def merge[A <% Ordered[A]](xs: List[A], ys: List[A]): List[A] =
    if (xs.isEmpty) ys
    else if (ys.isEmpty) xs
    else if (xs.head < ys.head) xs.head :: merge(xs.tail, ys)
    else ys.head :: merge(xs, ys.tail)

}