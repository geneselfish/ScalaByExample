package chap11.sect02.exercise

object Exercise {

  def main(args: Array[String]): Unit = {
    var i = 0
    repeatLoop {
      println("i = %d".format(i))
      i  += 1
    }({println("※i = %d".format(i)); i < 2})
  }

  /**
   * 演習 11.2.1 repeatLoop 関数を書きなさい。次のように適用されるものとします。
   * repeatLoop { command } ( condition )
   */
  def repeatLoop(command: => Unit)(condition: => Boolean) {
    command
    if (condition) repeatLoop(command)(condition)
    else ()
  }

}