/*
A pretty basic book class with Name, Author, whether or not it's been Read, and the Year Published
 */
class Book(val name: String, val author: String, var read: Boolean, val yearPublished: Int){

def showRead = println(read)
def showAuthor = println(author)
def showTitle = println(name)
  def showYear = println(yearPublished)

}




