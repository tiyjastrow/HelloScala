/** class represents a teacher, includes: f & l name, the number of students they have, a boolean field to represent
  * alumni status where true = alumni and an Integer for number of years at the school
  */
case class Teacher (val firstName: String, val lastName: String, var students: Int, val alumni: Boolean, var years: Int){

  def graded(): Unit =  println("Teacher has finished grading the assignment.")

}
