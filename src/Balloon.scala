/*
minimal definition of a balloon. Method call sings 99 red balloons by nena
 */
class Balloon {
  var howMany = 0
  var color = ""
  var inflate = true
  inflate match {
    case true => print("Floating in the summer sky")
    case false => println("Go by")
  }

  def singIt = println(s"$howMany $color balloons, $inflate")

}