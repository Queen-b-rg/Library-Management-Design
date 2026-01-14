public class DVD extends Item {
    private double duration;

    public DVD(String title, String author, String isbn, double duration) {
        super(title, author, isbn);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public void borrow() {
        System.out.println("DVD borrowed: " + title + " (Duration: " + duration + " minutes)");
        System.out.println("Special 3-day limit applies for DVDs.");
    }

    @Override
    public void returnItem() {
        System.out.println("DVD returned: " + title);
    }
}
