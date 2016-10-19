/**
  * Created by joe on 10/17/16.
  */
object Main {

  def main(args: Array[String]): Unit = {
    val honda = new Car()
    honda.engine = 2
    honda.gas = 10
    honda.seats = 5

    honda.currentCar()
    println("...")
    honda.carDetails(1, 2, 3, 4)
    println("...")
    val nora = new Cat()
    nora.currentCat("pink", true)
    println("...")
    nora.fluffy = false
    nora.noseColor = "black"

    nora.currentCat()
    println("...")

    val butterfly = new Paddle()

    butterfly.blade="carbon"
    butterfly.redRubber="short pip"
    butterfly.blackRubber="long pip"

    butterfly.desiredBaldeConfig()
    butterfly.calculateThickness(2)



  }
}
