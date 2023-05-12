package Animals;
import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        ArrayList<TvShow> shows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("TV-Show Details \nEntering nothing will stop the loop");

        while (true) {
            System.out.println("Name of Show: ");
            String tvName = scanner.nextLine();
            if (tvName == "") {
                break;
            } 
            System.out.println("How many episodes? " );
            int userEpInput = Integer.valueOf(scanner.nextLine());

            System.out.println("What is the genre? ");
            String genreName = scanner.nextLine();
            
            TvShow show = new TvShow(tvName, userEpInput, genreName);
            shows.add(show);
        }
        for (TvShow tvShow : shows){
            tvShow.getShowName();
            tvShow.getNumOfEps();
            tvShow.getGenre();
            System.out.println(tvShow);
        }
    }
    
}
