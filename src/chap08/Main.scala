package chap08

object Main {

  def main(args: Array[String]): Unit = {
    val x = new EmptyStack[Int]
    val y = x.push(1).push(2)
    println(y.pop.top)

    val s1 = new EmptyStack[String].push("abc")
    val s2 = new EmptyStack[String].push("abx").push(s1.top)
    println(isPrefix[String](s1, s2))
    println(isPrefix(s1, s2))// 見えていない型引数 [String] が型推論器によって挿入されます。
  }

  def isPrefix[A](p: Stack[A], s: Stack[A]): Boolean = {
    p.isEmpty ||
    p.top == s.top && isPrefix[A](p.pop, s.pop)
  }
}