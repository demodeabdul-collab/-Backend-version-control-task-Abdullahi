package com.library.system;
public interface Reservable {
    void reserveItem(String memberId);    // method 1
    void cancelReservation();             // method 2
    boolean isReserved();                 // method 3

}
