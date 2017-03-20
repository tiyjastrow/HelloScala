//the macronutrients that a person eats
class Diet (xsugar: Int, xfat: Int, xprotein: Int){
  var sugar: Int = xsugar
  var fat: Int = xfat
  var protein: Int = xprotein
  var calories: Int = 4 * (sugar + protein) + 9 * fat

  override def toString(): String = s"Your diet of $sugar grams sugar, $fat grams fat, and $protein grams protein has $calories calories."
}