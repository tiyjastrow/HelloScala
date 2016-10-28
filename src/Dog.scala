/**
  * Created by jakefroeb on 10/28/16.
  */
case class Dog(name: String, breed: String, age: Int) {
  val dogYears = age*7

  def printDog = println(s"$name a $breed who is $age years old and $dogYears years old in dog years")

}
