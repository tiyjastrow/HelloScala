
object Main {
  def main(args: Array[String]) {

    var myDiet = new Diet(10, 2, 1)
    println(myDiet)

    val myFruit = new Fruit("apple", 19, 156)
    myFruit.eatQuantity(3)
    println(myFruit)

    val myVegetable = new Vegetable("kale", 1, 12, 3, 2)
    myVegetable.bake()
    println(myVegetable)
  }
}