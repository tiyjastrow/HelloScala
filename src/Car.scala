import scala.util.Random

/**
  * Created by joe on 10/17/16.
  */
//class represents a car
class Car {

}

object Car {

  val wheels = 4
  var engine = 2
  var gas = 0
  var seats = 4


  //Random.nextInt(seats)

  def main(args: Array[String]): Unit = {
    println(s"You have $wheels wheels on your car")
    println(s"You have $gas gallons in your car")
    println(s"Your engine is $engine liters")
    println(s"You have $seats in your car")

    println("\n...You bought a new car!")
    Car.engine = 4
    Car.gas = 10
    Car.seats = 5

    println(s"You have $wheels wheels on your car")
    println(s"You have $gas gallons in your car")
    println(s"Your engine is $engine liters")
    println(s"You have $seats in your car")
  }
}


