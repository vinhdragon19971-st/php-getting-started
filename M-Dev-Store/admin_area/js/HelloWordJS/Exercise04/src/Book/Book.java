/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

/**
 *
 * @author User
 */
public class Book {
    private String BookID;
    private String Category;
    private String Title;
    private String Author;
    private double Price;
    
    public Book() {
        BookID = "";
        Category = "";
        Title = "";
        Author = "";
        Price = 0.0d;
    }

    public Book(String BookID, String Category, String Title, String Author, double Price) {
        this.BookID = BookID;
        this.Category = Category;
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "===Book===" + "\nBookID=" + BookID + "\nCategory=" + Category + "\nTitle=" + Title 
                + "\nAuthor=" + Author + "\nPrice=" + Price + "\n======================\n";
    }
    
    public int compareTo(Book o){
        return 1;
    }
}
