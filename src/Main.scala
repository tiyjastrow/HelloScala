/**
  * Created by WesleyLewis on 10/17/16.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val slaughterhouseFive = new Book("Slaughthouse Five", "Vonnegut", true, 1960)
    Seq(slaughterhouseFive.showRead, slaughterhouseFive.showAuthor,
      slaughterhouseFive.showTitle, slaughterhouseFive.showYear)


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
