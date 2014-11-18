package chap08

abstract class Stack[A] {
  def push(x: A): Stack[A]
  def isEmpty: Boolean
  def top: A
  def pop: Stack[A]
}