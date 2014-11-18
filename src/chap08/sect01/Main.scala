package chap08.sect01

object Main {

  def main(args: Array[String]): Unit = {
    val x = new EmptySet[Num].incl(Num(1.0)).incl(Num(2.0))
    println(
      x.contains(Num(1.5))
    )
  }

}