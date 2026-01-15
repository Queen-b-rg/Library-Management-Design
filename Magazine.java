public class Magazine extends Item {
    private int issueNumber;

    public Magazine(String title, String author, String isbn, int issueNumber) {
        super(title, author, isbn);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public void borrow() {
        System.out.println("Magazine borrowed: " + title + " by " + author + " (Issue #" + issueNumber + ")");
    }

    @Override
    public void returnItem() {
        System.out.println("Magazine returned: " + title + " (Issue #" + issueNumber + ")");
    }
}
