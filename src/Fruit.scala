//represents a fruit for nutrition purposes
class Fruit (val xname: String, val xsugar: Int, val xwater: Double){
  val name = xname
  val sugar = xsugar
  val water = xwater
  val calories = sugar * 4
  var totalCalories = calories
  var liters: Double = water/1000
  def eatQuantity (x: Int): Unit ={
    totalCalories = totalCalories * x
    liters = liters * x
  }

  override def toString: String = s"You ate $totalCalories calories of $name and $liters liters of water."
}
