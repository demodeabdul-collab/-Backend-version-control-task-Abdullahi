package com.library.system;

public abstract class LibraryItem implements Searchable, Displayable {
    private String itemId;
    private String title;

    public LibraryItem(String itemId, String title){
        this.itemId = itemId;
        this.title = title;

    }
    public String getItemId(){ return itemId;}
    public void setItemId(String itemId){this.itemId = itemId;}
   
    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}
   
    public abstract double calculateFine(int daysLate);
    
    @Override
   public  boolean searchByTitle(String title){
       return this.title.equalsIgnoreCase(title);
   }     // method 1
   @Override
   public boolean searchByAuthor(String author){
    return false;
   }   // method 2
    @Override
    public void displayDetails(){
        System.out.printf("The item %s has a ttle %s",itemId,title);
    }   
  
     @Override
     public void showInfo(){
        displayDetails();
     }                   // method 1
    
    @Override
    public String getItemType(){
        return "Library Item";
    }              // method 2
    
    @Override
    public void printDetails(){
        displayDetails();
    }
}
