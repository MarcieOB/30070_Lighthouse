import org.scalatest.funsuite.AnyFunSuite

class LighthouseTest extends AnyFunSuite:

  test("A lighthouse starts with the light off") {
    val myLighthouse = Lighthouse()
    assert(myLighthouse.onOrOff_? === LightState.OFF)
  }

  test("after pressing button once, the light is on") {
    val myLighthouse = Lighthouse()
    myLighthouse.pressButton()
    assert(myLighthouse.onOrOff_? === LightState.ON)
  }