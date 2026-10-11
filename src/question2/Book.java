package question2;

import java.util.Arrays;

public class Book {
    private int ISBN;
    private String name;
    private Author[] authors;
    private String publisher;
    private double price;

    public Book(int ISBN, String name, Author[] authors, String publisher, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.price = price;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ISBN : " + getISBN() +
                "\nName : " + getName() +
                "\nAuthors : " + Arrays.toString(authors) +
                "\nPublisher : " + getPublisher() +
                "\nPrice : " + getPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Book) {
            Book b = (Book) obj;
            return ISBN == b.ISBN;
        }
        return false;
    }
}

