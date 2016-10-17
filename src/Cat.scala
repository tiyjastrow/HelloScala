import java.util.Locale.Category

/**
  * Created by joe on 10/17/16.
  */
//class represents the average housecat
class Cat {

}

object Cat {

  val ears = 2
  var noseColor = "Pink"
  var fluffy = true
  var favoriteFood = "filet mignon"
  var coatColor = "white"

  def main(args: Array[String]): Unit = {

    println(s"Your cat has $ears ears")
    println(s"Your cat's nose color is $noseColor")
    println(s"Is your cat fluffy?: $fluffy")

    Cat.noseColor = "black"
    Cat.favoriteFood = "Surf and turf"
    Cat.coatColor = "Polka dots"

    println("\n...you adopted a new cat!")
    println(s"Your cat's favorite food is $favoriteFood")
    println(s"Your cat's nose color is $noseColor")
    println(s"Your cat's coat color is $coatColor")
  }
}


