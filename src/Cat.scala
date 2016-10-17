import java.util.Locale.Category

/**
  * Created by joe on 10/17/16.
  */
//class represents the average housecat
class Cat() {
  val ears = 2
  var noseColor = ""
  var fluffy = true

  def currentCat(): Unit ={
    println(s"Your cat has $ears ears")
    println(s"Your cat's nose color is $noseColor")
    println(s"Is your cat fluffy?: $fluffy")
  }

  def currentCat(noseColor: String, fluffy: Boolean) {
    println(s"Your cat has $ears ears")
    println(s"Your cat's nose color is $noseColor")
    println(s"Is your cat fluffy?: $fluffy")
  }
}



