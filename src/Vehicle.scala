/**
  * This class represents vehicle information
  */


case class Vehicle(var make: String, var model: String, val year: Int){
  def purchase() = println("Vehicle was purchased!")

}
