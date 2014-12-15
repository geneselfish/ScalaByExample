/**
 * @author 1134310008768
 *
 */
package object chap15 {

  implicit object stringMonoid extends Monoid[String] {
    def add(x: String, y: String): String = x.concat(y)
    def unit: String = ""
  }

  implicit object intMonoid extends Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y
    def unit: Int = 0
  }

  /**
   * 暗黙の型変換
   */
  implicit def int2orderd(x: Int): Ordered[Int] = new Ordered[Int] {
    def compare(y: Int): Int =
      if (x > y) 1
      else if (x < y) -1
      else 0
  }

}