package com.library.system;

public class BorrowTransaction extends Transaction {
    private String memberId;
    private String itemId;

    public BorrowTransaction(String transactionId, String date, String memberId, String itemId) {
        super(transactionId, date);
        this.memberId = memberId;
        this.itemId = itemId;
    }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    @Override
    public void processTransaction() {
        System.out.println("Processing borrow transaction " + getTranscationId() + " for item " + itemId);
    }
}
