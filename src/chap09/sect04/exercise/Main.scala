package chap09.sect04.exercise

object Main {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)
    println(squareList(list))
    println(squareList2(list))

    println(list.map(x => x * x))
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

}