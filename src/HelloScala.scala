
//The three main components of a Macbook.
// Each MacbookPro is made by Apple, has a certain screen size, measured in inches, and RAM capacity and
//hard drive space, measured in gigabites.

case class MacbookPro(model: String, size: Int, ram: Int, storage: Int)


//Three components of an iMac. Includes screen size, ram size and storage capacity.
case class iMac(model: String, size: Int, ram: Int, storage: String)


//Three componenets of an iPadAir. Includes screen size, ram size and storage capacity.
case class iPadAir(model: String, size: Double, ram: Int, storage: String)

object HelloScala {

  def main(args: Array[String]): Unit = {

    val p = MacbookPro("MacbookPro", 13, 8, 128)
    val proModel = p.model
    var screenSize = p.size
    var ramSize = p.ram
    var hardDrive = p.storage

    println(s"I purchased the $screenSize inch model of the $proModel and it has $ramSize MB of ram with $hardDrive " +
      s"GB of storage. ")

    val i = iMac("iMac", 27, 32, "500GB")
    val macModel = i.model
    val macSize = i.size
    var macRam = i.ram
    var macStorage = i.storage

    println(s"I have ordered a refurbished $macSize inch $macModel with $macRam MB of ram and a $macStorage hard drive.")

    val m = iPadAir("iPadAir", 9.7, 8, "64GB")
    val model = m.model
    val size = m.size
    var ram = m.ram
    var storage = m.storage

    println(s"The new $model is $size inches with $ram Mb of ram and has $storage of hard drive space.")


  }

}
