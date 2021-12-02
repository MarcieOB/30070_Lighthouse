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

  test("An even number of button pushes") {
    val myLighthouse = Lighthouse()
    for(i <- 1 to 6)
     myLighthouse.pressButton()
    assert(myLighthouse.onOrOff_? === LightState.OFF)
  }

  test("An odd number of button pushes") {
    val myLighthouse = Lighthouse()
    for(i <- 1 to 11)
      myLighthouse.pressButton()
    assert(myLighthouse.onOrOff_? === LightState.ON)
  }