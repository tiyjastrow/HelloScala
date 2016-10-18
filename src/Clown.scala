
class Clown {
  //Minimal definition of a clown
  var name = ""
  var scary = false
  var whatKind = ""

  def clownSentence(): Unit = {
    var isScary = ""
    if(scary) isScary = "A Very Scary Clown" else isScary = "A Very Funny Clown"
    println(s"$name Is $isScary $whatKind")
  }
}
