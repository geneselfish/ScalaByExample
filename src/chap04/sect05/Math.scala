package chap04.sect05

object Math {

  def main(args: Array[String]): Unit = {
    println(sqrt(2))
    println(sqrt(4))
  }

  /** 2乗 */
  def square(x: Double):Double = x * x
  /** 絶対値 */
  def abs(x: Double):Double = if (x >= 0) x else -x

  /**
   * 平方根。sect04を簡略化。
   *  Scala は通常のブロック構造のスコープ規則を用いています。外側のブロックで定義された
   *  名前は、そこで再定義されない限り、内側のブロックからも見えます。この規則によって s
   *  qrt の例を簡略化できます。ネストさせた関数の追加パラメータとして x を渡す必要はあ
   *  りません。なぜなら外側の関数 sqrt のパラメータは常に見えるからです。次が簡略化され
   *  たコードです。
   */
  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def improve(guess: Double): Double = (guess + x / guess) / 2

    def isGoodEnough(guess: Double): Boolean = abs(square(guess) - x) < 0.001

    sqrtIter(1.0)
  }

}