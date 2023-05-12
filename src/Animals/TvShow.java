package Animals;

public class TvShow {
    private String showName;
    private int numOfEps;
    private String genre;

    TvShow(String showName, int numOfEps, String genre){
    this.showName = showName;
    this.numOfEps = numOfEps;
    this.genre = genre;
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
    public String toString(){
        return "The name of the show is " +  this.showName + " with " + this.numOfEps + " number of episodes. The genre is " + this.genre;
    }
}
