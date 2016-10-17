/**
  * Created by halleyfroeb on 10/17/16.
  */
object Main {


  def main(args: Array[String]): Unit = {

    val rick = new Person("Rick", 65, "Male")
    val morty = new Person("Morty", 11, "Male")
    val summer = new Person("Summer", 17, "Female")
    val jerry = new Person("Jerry", 42, "Male")

    rick.printPerson(rick)
    morty.printPerson(morty)
    summer.printPerson(summer)
    jerry.printPerson(jerry)

    val dog = new Dog()
    dog.name = "Moose"
    dog.breed = "Lab"
    dog.isAlive = true
    dog.printFields()

    val concert = new Event("Adele", "October 17th", "Bridgestone")
    concert.printEvent(concert)

  }
  }
