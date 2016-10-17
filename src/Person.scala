/**
  * Created by jeremypitt on 10/17/16.
  */

//This class contains the first name, last name, and age of a person.
case class Person( val firstName: String = "Jim", val lastName: String = "Lee", var age: Int = 30) {





  def printField(): Unit ={
    println(s"$firstName $lastName is $age years old.")
  }
}



