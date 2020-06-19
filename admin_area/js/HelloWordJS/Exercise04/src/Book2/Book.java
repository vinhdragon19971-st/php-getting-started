/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book2;


public class Book {
    private String BookID;
    private String category;
    private String title;
    private String author;
    private double price;
    
    public Book(){
        BookID = "";
        category = "";
        title = "";
        author = "";
        price = 0.0d;
    }

    public Book(String BookID, String category, String title, String author, double price) {
        this.BookID = BookID;
        this.category = category;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "================Book Information================" 
                + "\nBookID=" + BookID 
                + "\ncategory=" + category 
                + "\ntitle=" + title 
                + "\nauthor=" + author 
                + "\nprice=" + price;
    }
    
    
}
