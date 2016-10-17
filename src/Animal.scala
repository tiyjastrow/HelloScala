/**
  * Created by jeremypitt on 10/17/16.
  */

//This class contains simple information about an animal, including their species, breed, and an array of common traits that they have.
case class Animal(var species: String = "Dog") {


  var breed = "corgi"
  var commonTraits = Array("Short", "long", "Tailless", "Adorable")

  def printFields(): Unit ={
    println(s"The best breed of $species is a $breed. They are ${commonTraits.mkString(", " )}.")
  }

}
