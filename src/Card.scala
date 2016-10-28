/**
  * Created by jakefroeb on 10/28/16.
  */
case class Card(suit: String, value: Int) {
  //Card class defines a playing card
  def color = {if(suit.equals("Diamonds")||suit.equals("Hearts")){
    println(s"cards color is red")
  }else {println("cards color is black")}}

  def printCard = println(s"$value of $suit")

}
