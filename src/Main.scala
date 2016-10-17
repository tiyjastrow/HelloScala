/**
  * Created by jeremypitt on 10/17/16.
  */
object Main {

  def main(args: Array[String]): Unit = {

    val per = Person("Bob", "Mortimer", 40)
    per.printField()

    val pet = Animal("Cat")
    pet.breed = "Calico"
    pet.commonTraits = Array("Is a cat", "Other things about calico cats", "idk")
    pet.printFields()

    val car = Car("Chevy")
    car.model = "Camaro"
    car.year = 2016
    car.printFields()
  }

}
