/**
  * Created by Zach on 10/17/16.
  */
class PingPongPaddle {

  var colors = Array("red","black")
  var material = "wood"
  var speedRating = 8.2
  var spinRating = 8.0
  var controlRating = 8.5

  def printFields(): Unit ={
    println(s"My new Ping Pong Paddel is a ${colors.mkString(", ")} $material paddel, with a speed rating of $speedRating, spin rating of $spinRating, and a control rating of $controlRating.")
  }
}
