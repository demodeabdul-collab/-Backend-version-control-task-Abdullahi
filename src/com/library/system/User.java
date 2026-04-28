package com.library.system;

public abstract class User implements Manageable {
    private  String memberId;
    private String name;

    public User(String memeberId, String name){
        this.memberId =memeberId;
        this.name = name;
    }

    public String getMemberId(){return memberId;}
    public void setMemberId(String memberId){this.memberId = memberId;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
     

     public abstract boolean canBorrow();

      @Override
      public void addItem(){
        System.out.println(name + " added an Itemm");
      }                   // method 1
    
    @Override
    public  void removeItem(){
         System.out.println(name + " removed an Itemm");
    }               // method 2
    
    @Override
    public void updateStatus(String status){
        System.out.println(name + "'s status updated to: " + status);
    } 
}
