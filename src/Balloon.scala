
class Balloon{
//minimal definition of a balloon. Method call sings 99 red balloons by nena
    var howMany = 0
    var color = ""
    var inflate = true
    def singIt(): Unit = {
      var inflated = ""
      if (inflate) inflated = "Floating in the summer sky" else inflated = "Go by"
      println(s"$howMany $color balloons, $inflated")
    }

}