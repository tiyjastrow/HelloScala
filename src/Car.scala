/**
  * Created by jeremypitt on 10/17/16.
  */

//This class lists the make, model, and year of a car.
case class Car(var make: String = "Ford") {

  var year = 1970
  var model = "Mustang"

  def printFields(): Unit ={
    println(s"I would like to drive a $year $make $model.")
  }

}
