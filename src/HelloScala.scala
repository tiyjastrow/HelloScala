/**
  * Created by lee on 10/17/16.
  */
object HelloScala {
  def main(args: Array[String]): Unit = {
    val smallPerson = new Child()
    smallPerson.firstName = "Billy"
    smallPerson.lastName = "Smith"
    smallPerson.age = smallPerson.findAgeByIndex(8)

    val childName = smallPerson.firstName + " " + smallPerson.lastName
    val childAge = smallPerson.age
    println(s"$childName is $childAge years old.")

    val mediumPerson = new Teenager()
    mediumPerson.firstName = "Alice"
    mediumPerson.lastName = "Smith"
    mediumPerson.age = mediumPerson.findAgeByIndex(3)

    val teenName = mediumPerson.firstName + " " + mediumPerson.lastName
    val teenAge = mediumPerson.age
    println(s"$teenName is $teenAge years old.")

    val largePerson1 = new Adult()
    largePerson1.firstName = "Linda"
    largePerson1.lastName = "Smith"
    largePerson1.age = largePerson1.findAgeByIndex(14)

    val motherName = largePerson1.firstName + " " + largePerson1.lastName
    val motherAge = largePerson1.age
    println(s"$motherName is $motherAge years old.")

    largePerson1.offspring = largePerson1.offspring.+:(smallPerson)
    largePerson1.offspring = largePerson1.offspring.+:(mediumPerson)

    println(s"$motherName's children are:")
    for (c <- largePerson1.offspring) println(c.firstName + " " + c.lastName)

    val largePerson2 = new Adult()
    largePerson2.firstName = "Bob"
    largePerson2.lastName = "Smith"
    largePerson2.age = largePerson2.findAgeByIndex(12)

    largePerson2.offspring = largePerson2.offspring.+:(smallPerson)
    largePerson2.offspring = largePerson2.offspring.+:(mediumPerson)

    val fatherName = largePerson2.firstName + " " + largePerson2.lastName
    val fatherAge = largePerson2.age
    println(s"$fatherName is $fatherAge years old.")

    smallPerson.parents = smallPerson.parents.+:(largePerson1)
    smallPerson.parents = smallPerson.parents.+:(largePerson2)

    println(s"$childName's parents are:")
    for (p <- smallPerson.parents) println(p.firstName + " " + p.lastName)
  }
}

abstract class Person {
  var firstName : String = ""
  var lastName : String = ""
  var age : Int = 0
  var parents = Array[Adult]()
  val ageRange : List[Int] = List.range(0,115)
  val findAgeByIndex = (ageIndex: Int) => ageRange(ageIndex)

}

class Child extends Person {
  override val ageRange = List.range(0,13)
  def yearsUntilTeenage(age: Int) = 13 - age
}

class Teenager extends Person {
  override val ageRange = List.range(13,20)
  def yearsUntilAdult(age: Int) = 20 - age
}

class Adult extends Person {
  var offspring = Array[Person]()
  override val ageRange = List.range(20, 115)
  def yearsSinceChildhood(age: Int) = age - 13
  def yearsSinceTeenager(age: Int) = age - 20
}

