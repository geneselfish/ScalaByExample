package chap07.sect02.exercise

abstract class IntTree

case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree