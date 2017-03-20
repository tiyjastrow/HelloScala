//represents a vegetable for nutrition purposes
class Vegetable (val xname: String, val xcarb: Double, val xwater: Double, val xfiber: Double, val xprotein: Double){
  val name = xname
  val carb = xcarb
  val water = xwater
  val fiber = xfiber
  val protein = xprotein
  val calories: Double = (carb + protein) * 4
  val liters: Double = water/1000
  var baked: Boolean = false
  var totalCalories: Double = calories
  var finalLiters = liters
  def bake (): Unit ={
    baked = true
    totalCalories = totalCalories * 1.1
    finalLiters = liters * 0.6
    println (s"You baked $name. Water content was reduced from $liters to $finalLiters liters.")
  }
  override def toString: String = s"The $name has $fiber grams fiber, $protein grams protein, and $finalLiters liters of water."

}