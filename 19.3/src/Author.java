public class Author {
   private String name;
  private  String surname;
  private Book[] listOfBooks;



    public Author(String name, String surname, Book[] listOfBooks) {
        this.name = name;
        this.surname = surname;
        this.listOfBooks = listOfBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setListOfBooks(Book[] listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Book[] getListOfBooks() {
        return listOfBooks;
    }
    public String toString() {
        String books = "";
        for (int i = 0; i < listOfBooks.length; i++) {
            books += listOfBooks[i] + " ";}
            return "Emri: " + name + "Mbiemri: " + surname + "Lista e librave: " + listOfBooks;

    }
}
