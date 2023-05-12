package Animals;

public class Book {

    private String title;
    private int numOfPages;
    private int publicationYear;

    public Book(String title){
        this.title = title;
        this.numOfPages = 0;
        this.publicationYear = 0;

    }
    public Book(String title, int numOfPages){
        this.title = title;
        this.numOfPages = numOfPages;
        this.publicationYear = 0;

    }
    public Book(String title, int numOfPages, int publicationYear ){
        this.title = title;
        this.numOfPages = numOfPages;
        this.publicationYear = publicationYear;

    }
    public String getTitle(){
        return this.title;
    }
    public int getNumOfPages(){
        return this.numOfPages;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public String toString(){
        return this.title + this.numOfPages + " pages " + this.publicationYear;
    }
}
