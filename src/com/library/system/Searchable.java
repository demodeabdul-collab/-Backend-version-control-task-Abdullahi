package com.library.system;
public interface Searchable {
    boolean searchByTitle(String title);     // method 1
    boolean searchByAuthor(String author);   // method 2
    void displayDetails();                   // method 3
}
