//represents a vegetable for nutrition purposes
class Vegetable (val xname: String, val xsugar: Int, val xwater: Double, val xfiber: Int, val xprotein: Int){
  val name = xname
  val sugar = xsugar
  val water = xwater
  val fiber = xfiber
  val protein = xprotein
  val calories: Double = (sugar + protein)* 4
  var totalCalories: Double = calories
  val liters: Double = water/1000
  var finalLiters = liters
  def bake (): Unit ={
    totalCalories = totalCalories * 1.1
    finalLiters = liters * 0.6
  }
  override def toString: String = s"You baked a $name. Water content was reduced from $liters to $finalLiters liters."
}