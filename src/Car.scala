/*  This class represents info about cars where make, model, build year, and number of doors is listed*/

class Car (var make: String, var model: String, var buildYear: Int, var numOfDoors: Int, var miles: Int, var gallons: Int) {

  def fuelEfficiency(): Double = {
    val mpg: Double = miles/gallons
    println(s"The fuel efficiency of this vehicle is: ${mpg} mpg")
    return mpg
  }
  override def toString: String = s"This vehicle is a $make $model that was built in $buildYear and has $numOfDoors doors"
}

object Car {
  def main(args: Array[String]): Unit = {
    val firstCar = new Car("Chevrolet", "Tahoe", 2002, 4, 48, 3)

    val secondCar = new Car("Ford", "F150", 2012, 2, 45, 3)

    val thirdCar = new Car("Toyota", "Prius", 2016, 4, 75, 2)

    println(firstCar)
    firstCar.fuelEfficiency()

    println()

    println(secondCar)
    secondCar.fuelEfficiency()

    println()

    println(thirdCar)
    thirdCar.fuelEfficiency()

  }

}
