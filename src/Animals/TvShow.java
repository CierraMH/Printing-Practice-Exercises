package Animals;

public class TvShow {
    private String showName;
    private int numOfEps;
    private String genre;
    private int time;

    TvShow(String showName, int numOfEps, String genre){
    this.showName = showName;
    this.numOfEps = numOfEps;
    this.genre = genre;
    }
    TvShow(String showName, int numOfEps, String genre, int time){
    this.showName = showName;
    this.numOfEps = numOfEps;
    this.genre = genre;
    this.time = time;
    }
    public String getShowName(){
        return this.showName;
    }
    public int getNumOfEps(){
        return this.numOfEps;
    }
    public String getGenre(){
        return this.genre;
    }
    public int getTime(){
        return this.time;
    }
    public String toString(){
        return "The name of the show is " +  this.showName + " with " + this.numOfEps + " number of episodes. They are " + this.time +  "mins long, and The genre is " + this.genre;
    }
}
