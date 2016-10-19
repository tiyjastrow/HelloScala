/**
  * Created by halleyfroeb on 10/17/16.
  */
case class Event (val name: String, val date: String, val location: String) {

  override def toString= s"New Event $name, at $location, on $date"

}
