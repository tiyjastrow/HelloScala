/**
  * Created by joe on 10/17/16.
  */

//class represents a ping pong paddle
class Paddle {

  val grip = ""
  var blade = ""
  var redRubber = ""
  var blackRubber = ""
  var thickness = 0
  var legalThickness = 4

  def desiredBaldeConfig(): Unit ={
    println(s"Blade type: $blade")
    println(s"Grip type: $grip")
    println(s"Red rubber type: $redRubber")
    println(s"Black rubber type: $blackRubber")
  }

  def calculateThickness(desiredThickness: Int){
     thickness = legalThickness - desiredThickness
    var remaining = legalThickness - thickness
    println(s"The red rubber thickness is $thickness mm")
    println(s"you have $remaining mm remaining for your black rubber")
  }
}

