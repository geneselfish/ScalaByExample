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
    )// List(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)
  }

  /**
   * nが素数であるか否か
   */
  def isPrime(n: Int) = List.range(2, n) forall (x => n % x != 0)
}