package com.library.system;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System Started ===\n");

        // 1. Create Library Items (Concrete classes)
        Book book = new Book("Java Programming", "B001", "James Gosling", "978-0134685991");
        Magazine magazine = new Magazine("National Geographic", "M001", 2026, "NatGeo");
        DVD dvd = new DVD("Inception", "D001", "Christopher Nolan", 148);

        // 2. Create Member
        Member member = new Member("M1001", "Abdellah", "abdellah@email.com", "0812345678");

        // 3. Create Transaction
        BorrowTransaction transaction = new BorrowTransaction("T001", "2026-04-22", "M1001", "B001");

        // === Demonstrate Getters and Setters ===
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());
        book.setTitle("Advanced Java");
        System.out.println("Updated Book Title: " + book.getTitle() + "\n");

        System.out.println("Member Name: " + member.getName());
        System.out.println("Member Email: " + member.getEmail() + "\n");

        // === Demonstrate Interface Methods ===
        System.out.println("--- Borrowable Interface ---");
         System.out.println("Can member borrow? " + member.canBorrow() + "\n");
        magazine.borrowItem(member.getMemberId());
        transaction.processTransaction();
        transaction.borrowItem(member.getMemberId());
         System.out.println("Fine for Magazine (5 days late): $" + magazine.calculateFine(5));
        magazine.returnItem();
        System.out.println("Available: " + magazine.isAvailable() + "\n");

        System.out.println("--- Reservable Interface ---");
        dvd.reserveItem(member.getMemberId());
        dvd.cancelReservation() ;

        System.out.println("--- Searchable & Displayable ---");
        book.displayDetails();
        book.searchByAuthor("James Gosling");
        System.out.println("Item Type: " + book.getItemType() + "\n");

        // === Demonstrate Abstract Methods ===
        System.out.println("--- Abstract Methods ---");
        System.out.println("Fine for Book (10 days late): $" + book.calculateFine(10));
        System.out.println("Fine for DVD (5 days late): $" + dvd.calculateFine(5));
      

        

        System.out.println("\n=== Library Management System Demo Completed Successfully! ===");
    }
}
