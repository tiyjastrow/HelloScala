
object Main {
    def main(args: Array[String]): Unit = {

        // Vehicle Class
        val altima = new Vehicle("Nissan", "Altima", 32, 67, 100)
        println(s"Your ${altima.make} ${altima.model} does ${altima.mpg}mpg " +
            s"and currently has ${altima.gasPercentage}% fuel remaining with ${altima.milesDriven} miles driven.")

        // Purchase Class
        val dollarGeneral = Purchase("Dollar General", List("milk", "eggs", "toothbrush"), 12.45)
        println(s"You bought ${dollarGeneral.items} from ${dollarGeneral.store} for $$${dollarGeneral.price}.")

        // InventoryItem Class
        val iceCubes = InventoryItem("ice cubes", 12034)
        println(s"Your store currently has ${iceCubes.quantity} ${iceCubes.label}.")
    }
}
