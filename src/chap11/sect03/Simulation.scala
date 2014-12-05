package chap11.sect03

/**
 * 具体的なシミュレーションは、抽象クラス Simulation を継承したオブジェクトの内部で行われます。
 *
 */
abstract class Simulation {
  /**
   * 現在のシミュレーション上の時刻を整数値として返します。
   */
  def currentTime: Int

  /**
   * currentTime から指定された時間が経過したときにアクションが実行されるよう、スケジュールします
   */
  def afterDelay(delay: Int, action: => Action)

  /**
   * 実行するアクションがなくなるまでシミュレーションを実行します。
   */
  def run()
}