/**
  * Created by jakefroeb on 10/28/16.
  */
case class Cloud (cloudType : String, length : Double, width: Double, weight: Double) {
  val density = weight / (length * width)

  def printCloud = println(s"it is a $cloudType, with an area of ${length * width} and a density of $density")



}
