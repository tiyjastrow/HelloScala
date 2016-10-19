/**
  * Created by halleyfroeb on 10/17/16.
  */
class Dog {
  var name = ""
  var breed = ""
  var isAlive = true

//  def printFields(): Unit={
//    var printAlive = ""
//    if(isAlive) printAlive = "is Alive" else printAlive = "is deceased"
//    println(s"$name is a $breed and $printAlive\n")
//  }
  var printAlive = ""
  if(isAlive) printAlive = "is Alive" else printAlive = "is deceased"

  override def toString = s"$name is a $breed and $printAlive\n"


}
