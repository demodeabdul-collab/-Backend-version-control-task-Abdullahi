package com.library.system;

public class DVD extends LibraryItem implements Borrowable, Reservable{
     private String director;
     private int duration;

     public DVD(String title, String itemId, String director, int duration){
        super(itemId, title);
        this.director = director;
        this.duration = duration;

     }
     
    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    
     @Override
     public double calculateFine(int daysLate){
        return 1.5*daysLate;
     }

      @Override
    public void borrowItem(String memberId){
       System.out.println("DVD '" + getTitle() + "' borrowed by " + memberId);
    }
    
      @Override
      public void returnItem(){
        System.out.println("DVD '" + getTitle() + "' has been returned " );
      }
      
        @Override
         public boolean  isAvailable(){
            return true;
         }
     @Override
    public void reserveItem(String memberId) {
        System.out.println("DVD '" + getTitle() + "' reserved by " + memberId);
    }

    @Override
    public void cancelReservation() {
        System.out.println("Reservation for DVD '" + getTitle() + "' cancelled.");
    }

    @Override
    public boolean isReserved() {
        return false;
    }

}

