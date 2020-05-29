package com.example.ecommerciandroiapp.Model;

public class HorizontalBookModel {
    private String bookTitle,bookCategory,bookImage;
    private int bookPrice;

    public HorizontalBookModel(BookModel books) {
        this.bookImage = books.getImageURL();
        this.bookTitle = books.getTitle();
        this.bookCategory = books.getCategoryID();
        this.bookPrice = books.getPrice();
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitel) {
        this.bookTitle = bookTitel;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
}