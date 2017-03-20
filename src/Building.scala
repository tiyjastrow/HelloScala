/* This class represents building inf that has a zoning type, square footage, number of floors, and location
*/

class FloorArea(var x: Int, var y: Int) {

  def calcArea(): Unit = {
    var area = x * y
  }

  override def toString: String = s"The area is: $x times $y"
}

class Building(var zoning: String, var numOfFloors: Int, var location: String){

  override def toString: String = s"The building zone type is $zoning, " +
    s"the number of floors is $numOfFloors, and the building is located in $location"
}

object Building {
  def main(args: Array[String]): Unit = {

    val buildingArea = new FloorArea(4, 5)

    println(buildingArea)

    val building = new Building("Residential", 4, "Nashville, TN")

    println(building)
  }


}

