/**
  * Created by halleyfroeb on 10/17/16.
  * Class Person represents the name, age and gender for each Person
  */
case class Person(val name: String, val age: Int, val gender: String) {

def printPerson(x: Person): Unit = {
  println(s"Name = $name, Age = $age, Gender = $gender\n")

}}

