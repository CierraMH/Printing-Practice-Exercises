package Animals;

public class Book {

    private String title;
    private int numOfPages;
    private int publicationYear;
    private String author;


    public Book(String title, int numOfPages, int publicationYear ){
        this.title = title;
        this.numOfPages = numOfPages;
        this.publicationYear = publicationYear;

    }
    public Book(String title, String author, int numOfPages, int publicationYear ){
        this.title = title;
        this.numOfPages = numOfPages;
        this.publicationYear = publicationYear;
        this.author = author;

    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getNumOfPages(){
        return this.numOfPages;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public String toString(){
        return this.title + ", Author: " + this.author + ", " + this.numOfPages + " pages, " + this.publicationYear;
    }
}
