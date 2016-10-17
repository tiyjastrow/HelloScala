/**
  * Created by Zach on 10/17/16.
  */
case class SuperHero(var heroName: String) {

  var heroPowers = Array("genius", "detective","billionare")
  var isAlive = false

  def printFields(): Unit ={
    val aliveOrDead = if (isAlive) "is currently alive" else "is currently dead"
    println(s"$heroName, is an awesome super hero whos special powers include ${heroPowers.mkString(", ")}, and " + aliveOrDead + ".")

  }
}
