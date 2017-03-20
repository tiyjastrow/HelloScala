
// keep up with inventory through a list of each inventory item and quantity
class InventoryItem (val label: String, var quantity: Int) {
    override def toString: String = {
        s"Your store currently has ${this.quantity} ${this.label}."
    }
}
