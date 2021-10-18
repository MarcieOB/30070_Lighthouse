
enum LightState:
  case ON
  case OFF

class Lighthouse:
  private var light = LightState.OFF

  def pressButton() =
    light = if light == LightState.OFF then
      LightState.ON
    else
      LightState.OFF

  def onOrOff_? : LightState = light


  