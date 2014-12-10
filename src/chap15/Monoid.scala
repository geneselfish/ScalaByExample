package chap15

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}

