/**
  * Created by jakefroeb on 10/28/16.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val cloud = Cloud("Cumulus",12,14,23)
    cloud.printCloud
    val dog = Dog("Chopper", "Golden", 16)
    dog.printDog
    val card = Card("Diamonds",2)
    card.color
    card.printCard
  }
}
