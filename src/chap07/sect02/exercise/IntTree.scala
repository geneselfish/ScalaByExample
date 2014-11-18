package chap07.sect02.exercise

/**
 * 整数の二分木（IntSet の別表現）
 */
abstract class IntTree

case object EmptyTree extends IntTree
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree