package chap10.sect03.exercise

import chap10.sect02.Sect02._

object Main {

  def main(args: Array[String]): Unit = {
    val xss = List(List(1,2,3), List(4,5,6))
    println(flatten(xss))
    println(flatten2(xss))

    /*
     * 演習 10.3.2 次を高階関数を用いて翻訳しなさい。
     */
    println(
      for (b <- books; a <- b.authors if a startsWith "Bird") yield b.title
    )
    //演習 10.3.2 解答案
    println(
      books.filter(_.authors.exists(_ startsWith "Bird")).map(_.title )
    )

    /*
     * 演習 10.3.2 次を高階関数を用いて翻訳しなさい。
     */
    println(
      for (b <- books if (b.title indexOf "Program") >= 0) yield b.title
    )
    //演習 10.3.2 解答案
    println(
      books.filter(_.title.indexOf("Program") >= 0).map(_.title)
    )
  }

  /**
   * 演習 10.3.1 次の関数を for を用いて定義しなさい。
   */
  def flatten[A](xss: List[List[A]]): List[A] =
    (xss :\ (Nil: List[A])) ((xs, ys) => xs ::: ys)
  /**
   * 演習 10.3.1 解答
   */
  def flatten2[A](xss: List[List[A]]): List[A] =
    for (xs <- xss; x <- xs) yield x

}