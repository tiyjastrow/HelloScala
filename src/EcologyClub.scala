// This class provides general information about the number of members in the Ecology Club, the meeting time and day

case class EcologyClub (numOfMembers: Int, meetingDay: String, meetingTime: Int){
def clubName() = println("Welcome to the Ecology Club!")
}

object Club {


  def main(args: Array[String]): Unit = {
    val club1 =  EcologyClub(10, "Monday", 1600)
    var club2 =  ArtClub(11, "Tuesday", 1700)
    var club3 =  DanceClub(30, "Friday", 1700)

    club1.clubName()
    println(s"Come Grow with us at ${club1.meetingTime} on ${club1.meetingDay} ")

    club2.clubName()
    println(s"This club meets at ${club2.meetingTime} on ${club2.meetingDay}.  Join our creative group of ${club2.numOfMembers}")

    club3.clubName()
    println(s"Come groove with us on ${club3.meetingDay} night at ${club3.meetingTime}!")


  }
}