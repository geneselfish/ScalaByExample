package chap02

/**
 * クイックソート
 */
object Quicksort {

  def main(args: Array[String]): Unit = {

  }

  def sort(xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(
        sort(xs filter (pivot >)),
        xs filter (pivot ==),
        sort(xs filter (pivot <))
      )
      //xs.filter(x => pivot < x)//pivotより小さい要素からなるArrayを作る（基本形）
      // ↓
      //xs filter (pivot < _)     //省略形
      // ↓
      //xs filter (pivot < )     //さらに省略（！？）
    }
  }

}