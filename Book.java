public class Book extends Item {
    private String genre;
    private int pageCount;

    public Book(String title, String author, String isbn, String genre, int pageCount) {
        super(title, author, isbn);
        this.genre = genre;
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Genre: " + genre);
        System.out.println("Page Count: " + pageCount);
    }

    @Override
    public void borrowItem() {
        System.out.println("Book \"" + title + "\" has been borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println("Book \"" + title + "\" has been returned.");
    }
}
