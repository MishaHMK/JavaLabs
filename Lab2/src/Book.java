import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Book {
    private int id, year, pages, price;
    private String title;
    private String author;
    private String publish;

    public Book(){
        id=0;
        year=0;
        pages=0;
        price = 0;
        title = "0";
        author = "0";
        publish = "0";
    }

    public Book(int i, int y, int p, int pr, String n, String a, String pub){
        id=i;
        year=y;
        pages=p;
        price = pr;
        title = n;
        author = a;
        publish = pub;
    }
    /**
     Setters
     */
    public void setId(int new_id){
        this.id = new_id;
    }

    public void setYear(int new_year){
        this.year = new_year;
    }

    public void setPages(int new_pages){
        this.pages = new_pages;
    }

    public void setPrice(int new_price){
        this.price = new_price;
    }

    public void setTitle(String new_title){
        this.title = new_title;
    }

    public void setAuthor(String new_author){
        this.author = new_author;
    }

    public void setPublish(String new_publish){
        this.publish = new_publish;
    }
    
    /**
     toString func
     */
    public String toString()
    {
        return "\nTitle: " + this.title
                + "\nBook ID: "+ this.id
                + "\nAuthor: " + this.author
                + "\nRelease year: " + this.year
                + "\nNumber of pages: " + this.pages
                + "\nPrice: " + this.price
                + "\nPublish:  " + this.publish
                + "\n---------------------------\n";
    }

    /**
     Getters
     */
    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getPage() {
        return pages;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublish() {
        return publish;
    }

}


