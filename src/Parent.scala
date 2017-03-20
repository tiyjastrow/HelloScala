/** class represents a single parent of a student or multiple students, includes: f & l name, number of students they
  * have in the school and a boolean value indicator alumni status where true represents alumni
  */
case class Parent (val firstName: String, val lastName: String, var students: Int, val alumni: Boolean){

  def approvedGrade(): Unit = println("Parent has approved the teacher's posted grade.")

}
