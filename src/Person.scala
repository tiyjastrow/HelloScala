/* This class represents a person class where values first name,
middle name, last name, age, location, and an integer list of the number of pets they own, homes they've lived in
 and the number of siblings are given
 */


case class Person(val firstName: String, val middleInitial: String, val lastName: String, val age: Int, val location: String, var list: (Int))


object Person {

  val firstName = "Jeff"
  val middleInitial = "W"
  val lastName = "Brinkley"
  val age = 33
  val location = "Nashville"
  var list = List (1, 6, 1)

  def main(args: Array[String]): Unit = {

    println(s"The name of the person is: $firstName $middleInitial $lastName")
    println(s"He is $age years old and lives in $location")
    println(s"His list is: $list")

  }

}
