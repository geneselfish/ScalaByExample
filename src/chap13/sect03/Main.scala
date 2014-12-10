package chap13.sect03
import Iterator._

object Main {

  def main(args: Array[String]): Unit = {
      val xs = Array(1.1, 1.2, 1.3, 2.0, 2.1)
      val limit = 1.5
      val result = indexListByLimit(xs, limit)
      for(i <- result) println(i)

      //for 内包表記を使っても実現できます。
      val result2 =
        for((x, i) <- tabulate(xs.length)(xs(_)).zip(from(0)) if x > limit)
          yield i
      for(i <- result2) println(i)
  }

  /**
   * double の配列のうち、要素がある値より大きいすべてのインデックス
   * を求めることを考えます。インデックスはイテレータとして返されるものとします。
   */
  def indexListByLimit(xs: Array[Double], limit: Double): Iterator[Int] = {
    tabulate(xs.length)(i => xs(i))//ArrayからIteratorに変換。fromArrayメソッドは廃止された？
    .zip(from(0))
//    .filter(t => t._1 > limit)
//    .filter(_._1 > limit)
    .filter({case (x, i) => x > limit})
    .map({case (x, i) => i})
  }

}