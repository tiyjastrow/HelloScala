
object Main {
  def main(args: Array[String]) {

    var myDiet = new Diet(10, 2, 1)
    println(myDiet)

    println("")

    val myFruit = new Fruit("apple", 19, 156)
    myFruit.eatQuantity(3)
    println(myFruit)

    println("")

    val myVegetable = new Vegetable("kale", 2.8, 23.6, 0.6, 0.9)
    println(myVegetable)
    myVegetable.bake()
    println(myVegetable)
  }
}