package org.example;

public final class Book {
    String name;
    double price;
    double rating;
    double countOfReviews;
    String shortDescription;
    Integer countOfPages;
    String typeOfBook;
    Book(String name, double price, double rating, double countOfReviews,  String shortDescription, Integer countOfPages, String typeOfBook) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.countOfReviews = countOfReviews;
        this.shortDescription = shortDescription;
        this.countOfPages = countOfPages;
        this.typeOfBook = typeOfBook;
    }
}
