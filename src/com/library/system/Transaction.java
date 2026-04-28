package com.library.system;

public abstract class Transaction implements Borrowable {
    private String transactionId;
    private String date;

    public Transaction(String transactionId, String date){
        this.transactionId = transactionId;
        this.date = date;
    }
     
    public String getTranscationId(){return transactionId;}
    public void setTransactionId(String transactionId){this.transactionId = transactionId;}

     public String getDate(){return date;}
    public void setdate(String date){this.date = date;}
 
    public abstract void processTransaction();

    @Override
    public void borrowItem(String memberId){
           System.out.println("Transaction " + transactionId + " - Item borrowed by " + memberId);
    }
      
       @Override
       public void returnItem(){
             System.out.println("Transaction " + transactionId + " - Item returned" );
       }
      
         @Override
        public    boolean  isAvailable(){
            return true;
        }
      
        


}
