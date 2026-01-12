public abstract class Item implements Borrowable {
  protected String title;  
  protected String author;  
  protected String isbn;

  public Item(String title, String author, String isbn) {
    this.title = title;
    this.author =author;
    this.isbn = isbn;
  }
