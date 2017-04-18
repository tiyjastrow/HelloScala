/**
  * Created by halleyfroeb on 10/17/16.
  */
object Main {


  def main(args: Array[String]): Unit = {

    val rick =  Person("Rick", 65, "Male")
    val morty =  Person("Morty", 11, "Male")
    val summer =  Person("Summer", 17, "Female")
    val jerry =  Person("Jerry", 42, "Male")

    val peopleList = List(rick, morty, summer, jerry)
    peopleList.foreach( (i: Person) => println(i.toString))

    //same as above but different method
    println(jerry.toString)

    val dog = new Dog()
    dog.name = "Moose"
    dog.breed = "Lab"
    dog.isAlive = true
    println(dog.toString)

    val concert = Event("Adele", "October 17th", "Bridgestone")
    println(concert.toString)

  }
  }
