package com.library.system;

public class Magazine extends LibraryItem implements Borrowable {
    private int issueNumber;
    private String publisher;

    public Magazine(String title, String itemId, int issueNumber, String publisher) {
        super(title, itemId);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    public int getIssueNumber() { return issueNumber; }
    public void setIssueNumber(int issueNumber) { this.issueNumber = issueNumber; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    @Override
    public double calculateFine(int daysLate) {
        return 0.7 * daysLate;
    }

    @Override
    public void borrowItem(String memberId) {
        System.out.println("Magazine '" + getTitle() + "' borrowed by " + memberId);
    }

    @Override
    public void returnItem() {
        System.out.println("Magazine '" + getTitle() + "' returned.");
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}