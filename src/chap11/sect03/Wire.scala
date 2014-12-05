package chap11.sect03

/**
 * 結線クラス
 */
class Wire {
  /** 結線の現在の信号 */
  private var sigVal = false
  /** 現在結線に付加されているアクション手続き */
  private var actions: List[Action] = List()

  /**
   * 結線の現在の信号を返します。
   */
  def getSignal: Boolean = sigVal

  /**
   * 結線の信号を sig に更新します。
   * 結線の信号が変更されるたびに、付加されたすべてのアクション手続きを実行します。
   */
  def setSignal(s: Boolean) =
    if (s != sigVal) {
      sigVal = s
      actions.foreach(_())
    }

  /**
   * 指定された手続き a を結線のアクションに付加します。
   */
  def addAction(a: Action) {
    actions = a :: actions; a()
  }
}