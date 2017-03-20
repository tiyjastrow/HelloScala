/** Class represents high school students, includes: f & l names and gpa.*/

case class Student (val firstName: String, val lastName: String, var gpa: Double) {

  def dropout(): Unit =  println("Student dropped out.")

}
