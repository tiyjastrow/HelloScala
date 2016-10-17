/**
  * Created by Zach on 10/17/16.
  */
object Main {

  def main(args: Array[String]): Unit = {

    val sh = SuperHero("Batman")
    sh.isAlive = true
    sh.printFields()

    println("\n")

    val tree = new Tree()
    tree.color = "red"
    tree.isEvergreen = false
    tree.species = "Japanese Maple"
    tree.printFields()

    println("\n")

    val paddel = new PingPongPaddle()
    paddel.material = "wooden"
    paddel.colors = Array("blue", "black")
    paddel.controlRating = 8.5
    paddel.speedRating = 7.8
    paddel.spinRating = 8.9
    paddel.printFields()

    println("\n -------print option 2-------")
    println(s"My new Ping Pong Paddel is a ${paddel.colors.mkString(", ")} ${paddel.material} paddel, " +
      s"with a speed rating of ${paddel.speedRating}, spin rating of ${paddel.spinRating}, " +
      s"and a control rating of ${paddel.controlRating}.")
  }
}
