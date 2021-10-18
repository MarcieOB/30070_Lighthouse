
class LighthouseKeeper:
  private val lightHouse = Lighthouse()
  private var awake = true
  private var daysOnDuty = 0

  def doAtDawn: Unit =
    awake = true
    daysOnDuty += 1
    lightHouse.pressButton()

  def doAtDusk: Unit =
    awake = false
    lightHouse.pressButton()

  override def toString: String =
    val status = if awake then "awake" else "asleep"
    s"Keeper is $status after $daysOnDuty days work"


