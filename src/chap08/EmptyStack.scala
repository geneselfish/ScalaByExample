package chap08

class EmptyStack[A] extends Stack[A] {
//  def push(x: A): Stack[A] = new NonEmptyStack[A](x, this)
  def isEmpty = true
  def top = error("EmptyStack.top")
  def pop = error("EmptyStack.pop")
}