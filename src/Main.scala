class Main {

}

object Main {
  def main(args: Array[String]): Unit = {

    val myCar = Vehicle("Honda","Accord", 2013)
    val owner1 = Owner("Tom", "Jones", 35 )
    val dealership1 = Dealership("Music City Motors", "Nashville", "TN", List("Cars","Trucks", "SUVs", "Motorcycles"))


    println(s"${myCar.year} ${myCar.make} ${myCar.model}")
    myCar.purchase()

    println(s"${owner1.firstName} ${owner1.lastName} congratulations on your purchase!")


    println(s"${dealership1.name} specializes in ${dealership1.vehicleSpeciality(0)}, ${dealership1.vehicleSpeciality(1)}, " +
      s"${dealership1.vehicleSpeciality(2)}, and ${dealership1.vehicleSpeciality(3)}")


    dealership1.sell()

  }

}