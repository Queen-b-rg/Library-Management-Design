import java.util.ArrayList;

public class Library {
  private ArrayList<Item> items;

  public Library() {
    this.items = new ArrayList<Item>();
  }

  public void addItem(Item item) {
    if (item != null) {
      items.add(item);
    }
  }

  public void displayAllItems() {
    if (items.isEmpty()) {
      System.out.println("No items in the library.");
      return;
    }
    
    System.out.println("Library Items:");
    System.out.println("-------------");
    for (int i = 0; i < items.size(); i++) {
      Item item = items.get(i);
      System.out.println((i + 1) + ". Title: " + item.title + 
                        ", Author: " + item.author + 
                        ", ISBN: " + item.isbn);
    }
  }

  public ArrayList<Item> searchByTitle(String searchTitle) {
    ArrayList<Item> results = new ArrayList<Item>();
    
    if (searchTitle == null || searchTitle.trim().isEmpty()) {
      return results;
    }
    
    String lowerSearchTitle = searchTitle.toLowerCase().trim();
    
    for (Item item : items) {
      if (item.title != null && item.title.toLowerCase().contains(lowerSearchTitle)) {
        results.add(item);
      }
    }
    
    return results;
  }
}

