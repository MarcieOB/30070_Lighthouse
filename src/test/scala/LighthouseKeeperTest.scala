import org.scalatest.funsuite.AnyFunSuite

class LighthouseKeeperTest extends AnyFunSuite:

  test("The Lighthouse Keeper begins awake") {
    val myKeeper = LighthouseKeeper()
    assert(myKeeper.awake == true)
  }

