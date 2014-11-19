package chap08.sect01

/**
 * 型パラメータの上限境界
 */
trait Set[A <: Ordered[A]] {
  def incl(x: A): Set[A]
  def contains(x: A): Boolean
}