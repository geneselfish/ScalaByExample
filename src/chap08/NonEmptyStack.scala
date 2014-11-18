package chap08

class NonEmptyStack[A](elem: A, rest: Stack[A]) extends Stack[A] {
  def push(x: A): Stack[A] = new NonEmptyStack[A](x, this)
  def isEmpty = false
  def top = elem
  def pop = rest
}