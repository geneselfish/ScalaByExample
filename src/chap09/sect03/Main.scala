package chap09.sect03

/**
 *
 */
object Main {

  def main(args: Array[String]): Unit = {
    val list1 = List(5, 7, 1, 3)
    //昇順
    val result1 = msort[Int]((x, y) => x < y)(list1)
    println(result1)
    //降順
    val result2 = msort[Int]((x, y) => x > y)(list1)
    println(result2)

    //msort の定義はカリー化されていて、特定の比較関数を使って簡単に特化できます。たとえば
    val intSort = msort[Int]((x, y) => x < y) _
    val reverseSort = msort[Int]((x, y) => x > y) _
    println(intSort(list1))
    println(reverseSort(list1))
  }

  /**
   * マージソート
   */
  def msort[A](less: (A, A) => Boolean)(xs: List[A]): List[A] = {

    def merge(xs1: List[A], xs2: List[A]): List[A] =
      if (xs1.isEmpty) xs2
      else if (xs2.isEmpty) xs1
      else if (less(xs1.head, xs2.head)) xs1.head :: merge(xs1.tail, xs2)
      else xs2.head :: merge(xs1, xs2.tail)

    val n = xs.length/2
    if (n == 0) xs
    else merge(msort(less)(xs take n), msort(less)(xs drop n))
  }

}