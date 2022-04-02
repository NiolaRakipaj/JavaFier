public class Book {
    private int isbn;
    private int yearOfProduction;
    private String title;

    public Book(int isbn, int yearOfProduction, String title) {
        this.isbn = isbn;
        this.yearOfProduction = yearOfProduction;
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
