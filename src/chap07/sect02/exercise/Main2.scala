package chap07.sect02.exercise

object Main2 {

  def main(args: Array[String]): Unit = {

  }

  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case Node(e, l, r) => if(v < e) contains(l, v)
                          else if(v > e) contains(r, v)
                          else true
  }

  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => Node(v, EmptyTree, EmptyTree)
    case Node(e, l, r) => if(v < e) Node(e, insert(l, v), r)
                          else if(v > e) Node(e, l, insert(r, v))
                          else t//あるいは、Node(e, l, r)でも可
  }

}