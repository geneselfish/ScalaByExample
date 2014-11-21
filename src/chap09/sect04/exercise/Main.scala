package chap09.sect04.exercise

object Main {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    println(squareList(list))
    println(squareList2(list))

    println(list.map(x => x * x))

    println(
      mapFun(list, (x: Int) => x * 2)
    )

    println(
      lengthFun(list)
    )
  }

  /**
   * 演習 9.4.1 リストの要素すべてを２乗して、結果のリストを返す関数
   */
  def squareList(xs: List[Int]): List[Int] = xs match {
    case Nil => xs
    case y :: ys => y * y :: squareList(ys)
  }

  /**
   * 上の別バージョン
   */
  def squareList2(xs: List[Int]): List[Int] = xs.map(x => x * x)

  /**
   * 演習 9.4.3 書かれていない式を埋めて、次の基本的なリスト操作定義を畳み込み操作として完成しなさい。
   */
  def mapFun[A, B](xs: List[A], f: A => B): List[B] =
    (xs :\ List[B]()){(x, bs) => f(x) :: bs}

  def lengthFun[A](xs: List[A]): Int =
    (0 /: xs){(n, x) => n + 1}
}