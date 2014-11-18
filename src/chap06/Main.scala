package chap06

object Main {

  def main(args: Array[String]): Unit = {
    var x = new Rational(0, 1)
    for(i <- 1 to 10) {
      x += new Rational(1, i)
    }
    println(x)
  }

}