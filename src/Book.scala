
case class Book (name: String, author: String, var read: Boolean, yearPublished: Int)
//A pretty basic book class with Name, Author, whether or not it's been Read, and the Year Published

object Book{
  def showRead(x : Book) = println(x.read)
  def showAuthor(x : Book) = println(x.author)
  def showTitle(x : Book) = println(x.name)
  def showBook(x : Book) = println(x)

  def main(args: Array[String]): Unit = {
    val dune = new Book("Dune", "Herbert", true, 1960)
    dune.read = false
    val lotr = new Book("Lord of the Rings", "Tolkien", true, 1947)
    val beingThere = new Book("Being There", "Kosinski", true, 1959)
    val foundation = new Book("Foundation", "Asimov", false, 1950)
    Book.showRead(dune)
    Book.showRead(lotr)
    Book.showAuthor(beingThere)
    Book.showTitle(foundation)
    Book.showBook(foundation)
  }
}




