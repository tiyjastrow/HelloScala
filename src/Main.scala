/**
  * Created by WesleyLewis on 10/17/16.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val killingFloor = new Book("Killing Floor", "Lee Child", false, 2000)
    Book.showBook(killingFloor)
    Book.showAuthor(killingFloor)
    killingFloor.read = true
    Book.showRead(killingFloor)

    val balloon = new Balloon
    balloon.howMany = 99
    balloon.color = "red"
    balloon.inflate = true
    balloon.singIt()

    val clown = new Clown
    clown.name = "Bozo"
    clown.whatKind = "On TV"
    clown.clownSentence()

  }
}
