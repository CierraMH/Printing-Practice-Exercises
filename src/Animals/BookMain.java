package Animals;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Book Details );

        while (true) {
            System.out.println("Enter Book title: \nEntering nothing will stop the loop");
            String title = scanner.nextLine();
            if (title == "") {
                break;
            } 
            System.out.println("How many pages does this book have? " );
            int pageInput = Integer.valueOf(scanner.nextLine());

            System.out.println("What year was it published?" );
            int yearInput = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(title, pageInput, yearInput);
            books.add(book);
        }
        System.out.println("What information would you like to be printed? \nNote: Please enter the details as written here to gather the information wanted (title, author, publicationYear,TotalPages, or everything).");
        String userInput = scanner.nextLine();

        if (userInput.equals("title")) {
            for (Book Book : books){
                Book.getTitle();
                System.out.println(Book.getTitle());
            }
        } else if (userInput.equals("publicationYear")) {
            for (Book Book : books){
            Book.getPublicationYear();
            }
        } else if (userInput.equals("TotalPages")) {
            for (Book Book : books){
            Book.getNumOfPages();
            }
        } else if (userInput.equals("author")) {
            for (Book Book : books){
            Book.getAuthor();
            }
        } else if(userInput.equals("everything")){
            for (Book Book : books){
                Book.getTitle();
                Book.getNumOfPages();
                Book.getPublicationYear();
                Book.getAuthor();
                System.out.println(Book);
            }
        }
    }
}
