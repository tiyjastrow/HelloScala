
//class represents a car
class Car {

  var wheels = 4
  var engine = 0
  var gas = 0
  var seats = 0

  def currentCar(): Unit ={
    println(s"You have $wheels wheels on your car")
    println(s"You have $gas gallons in your car")
    println(s"Your engine is $engine liters")
    println(s"You have $seats in your car")
  }

  def carDetails(wheels: Int, engine: Int, gas: Int, seats: Int) {
    println(s"You have $wheels wheels on your car")
    println(s"You have $gas gallons in your car")
    println(s"Your engine is $engine liters")
    println(s"You have $seats in your car")
  }

}


