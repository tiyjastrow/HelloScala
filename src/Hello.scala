object HelloWorld{

  def main(args: Array[String]) {

    val p = new Person("John", "Cage", 105)
    val m = new Message(1, "Chicken Biscuits", false)
    val newTimeLine = new Timeline(23, 0.0, 1200.000, 3000, s"a bit of spoken ${m.text}")


    println(s"Hello, ${p.first} ${p.last}. ${m.text} is ${m.privacy}. Time for ${newTimeLine.description}.")
  }

}