package com.company;

public class MainStLibrary {
    public String firstLibrary;
    public String printOpeningHours;
    private String booksInLibrary;
//    private String MainStLibrary;

    public MainStLibrary (String firstLibrary, String printOpeningHours, String booksInLibrary) {
        this.firstLibrary = "10 Main St.";
        this.printOpeningHours = "Open between the hours of 9am-5pm seven days a week";
        this.booksInLibrary = " The Lord of the Rings, The Da Vinci Code, Le Petit Prince, and The Tale of Two Cities";

    }

    //Yeah--- couldnt even come close to figuring this out
//    public class booksInLibrary {
//        Book("The Lord of the Rings"));
//        firstLibrary.addBook(new
//
//        Book("The Da Vinci Code"));
//        firstLibrary.addBook(new
//
//        Book("Le Petit Prince"));
//        firstLibrary.addBook(new
//
//        Book("A Tale of Two Cities"));
//        firstLibrary.addBook(new
//
//        return booksInLibrary;
//    }
//

    @Override
    public String toString() {
        return firstLibrary + printOpeningHours + booksInLibrary;
    }
}
