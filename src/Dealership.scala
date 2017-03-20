/**
  * This class represents vehicle dealership information
  */

case class Dealership(val name: String, var city: String, var state: String, val vehicleSpeciality: List[String]) {
      def sell() = println("Vehicle was sold!")

}
