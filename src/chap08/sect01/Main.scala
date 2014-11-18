package chap08.sect01

object Main {

  def main(args: Array[String]): Unit = {
    val s = new EmptySet[Num].incl(Num(1.0)).incl(Num(2.0))
    println(
      s.contains(Num(1.5))
    )
  }

}