import java.util.Scanner;

public class Library {
    private String id;
    private String name;
    private String author;
    private int year;
    private int quantity;

    public Library() {
    }

    public Library(String id, String name, String author, int year, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return this.id + " - "
                + this.name + " - "
                + this.author + " - "
                + this.year + " - "
                + this.quantity;
    }
}
