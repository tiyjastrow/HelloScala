/**
  * Created by Zach on 10/17/16.
  */
class Tree {

  var color = ""
  var species = ""
  var isEvergreen = true

  def printFields(): Unit ={
    var printEvergreen = ""
    if (isEvergreen) printEvergreen = "is an Evergreen" else printEvergreen = "is not an Evergreen"
    println(s"This $species tree is $color and $printEvergreen" + ".")
  }

}
