package src.src.IteratorExample;

public class Player {
    private String name;
    private String sport;
    private String position;
    private int rating;

    public Player(String name, String sport, String position, int rating) {
        this.name = name;
        this.sport = sport;
        this.position = position;
        this.rating = rating;
    }

    public String getName() {return name;}
    public String getSport() {return sport;}
    public String getPosition() {return position;}
    public int getRating() {return rating;}
}
