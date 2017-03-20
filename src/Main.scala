
object Main {

  def main(args: Array[String]): Unit = {

    val student = new Student("Bobby", "Jones Jr.", 3.7)
    val teacher = new Teacher("Henry", "Adams", 110, false, 8)
    val parent = new Parent("Bob", "Jones Sr.", 1, true)

    student.dropout()
    teacher.graded()
    parent.approvedGrade()

    println(s"${student.firstName} ${student.lastName} has a ${student.gpa} gpa.")

    println(s"${student.firstName} ${student.lastName}'s homeroom " +
      s"teacher is ${teacher.firstName} ${teacher.lastName}")

    println(s"${teacher.firstName} ${teacher.lastName} met with ${student.firstName}'s parent, " +
      s"${parent.firstName} ${parent.lastName} to review the graded assignment.")





  }
}
