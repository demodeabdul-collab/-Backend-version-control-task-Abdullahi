package com.library.system;

public class Book extends LibraryItem implements Borrowable, Reservable{
    private String author;
    private String isbn;

    public Book( String title, String itemId, String author, String isbn){ super(itemId, title);
        this.author = author;
        this.isbn = isbn;
    }
 public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    @Override
    public double calculateFine(int daysLate){
        return 1* daysLate;
    }
    
    @Override
    public void borrowItem(String memberId){
       System.out.println("Book '" + getTitle() + "' borrowed by " + memberId);
    }
    
      @Override
      public void returnItem(){
        System.out.println("Book '" + getTitle() + "' has been returned " );
      }
      
        @Override
         public boolean  isAvailable(){
            return true;
         }
     @Override
    public void reserveItem(String memberId) {
        System.out.println("Book '" + getTitle() + "' reserved by " + memberId);
    }

    @Override
    public void cancelReservation() {
        System.out.println("Reservation for Book '" + getTitle() + "' cancelled.");
    }

    @Override
    public boolean isReserved() {
        return false;
    }



}

