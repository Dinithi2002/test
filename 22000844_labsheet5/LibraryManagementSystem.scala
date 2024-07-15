object LibraryManagementSystem {
  
  case class Book(title: String, author: String, isbn: String)

  var library: Set[Book] = Set(
    Book("Madolduuwa", "Martien Wickramasinghe", "123"),
    Book("Amba Yaluwo", "Kumarathunga Munidasa", "456"),
    Book("Harry Potter", "J.K.Rowling", "789")
  )

  def addBook(book: Book): Unit = {
    library += book
    println(s"Book added: ${book.title}")
  }

  def removeBook(isbn: String): Unit = {
    library.find(_.isbn == isbn) match {
      case Some(book) =>
        library -= book
        println(s"Book removed: ${book.title}")
      case None =>
        println(s"No book found with ISBN: $isbn")
    }
  }

  def bookExists(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    println("Current Library Collection:")
    library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }

  def searchBookByTitle(title: String): Unit = {
    library.find(_.title.equalsIgnoreCase(title)) match {
      case Some(book) =>
        println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"No book found with title: $title")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
    } else {
      println(s"No books found by author: $author")
    }
  }

  def main(args: Array[String]): Unit = {
    displayLibrary()

    val newBook = Book("Hamlet", "William Shakespeare", "147")
    addBook(newBook)

    println(s"Is 'Harry Potter' by George Orwell in the library? ${bookExists("789")}")

    removeBook("789")

    searchBookByTitle("Madolduuwa")

    displayBooksByAuthor("J.K.Rowling")

    displayLibrary()
  }
}
