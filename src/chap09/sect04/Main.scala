package chap09.sect04

object Main {

  def main(args: Array[String]): Unit = {
    println(isPrime(1))// true
    println(isPrime(2))// true
    println(isPrime(3))// true
    println(isPrime(4))// false

    //1から100までの素数リスト
    println(
      List.range(1, 101).filter(isPrime(_))
    )
  }

  /**
   * nが素数であるか否か
   */
  def isPrime(n: Int) = List.range(2, n) forall (x => n % x != 0)
}