public class Main {
    public static void main (String[] args){






        Book[] books = new Book[]{new Book(12, 2000, "titulli"),new Book(89, 2003, "titulli2")};
        Author author = new Author("IsmaiL", "Kadare", books);
System.out.println(author.toString());
    }
}
