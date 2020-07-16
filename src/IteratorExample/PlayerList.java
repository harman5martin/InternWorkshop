package src.src.IteratorExample;

import java.util.ArrayList;
import java.util.List;

public class PlayerList {
    private List<Player> playerList;

    public PlayerList() {
        playerList = new ArrayList<Player>();
        addPlayers();
    }

    public void addPlayers() {
        playerList.add(new Player("Harman","football", "safety",5));
        playerList.add(new Player("Bob","football", "quarterback",4));
        playerList.add(new Player("Joe","baseball", "pitcher",5));
        playerList.add(new Player("Carlos","basketball", "power forward",3));
        playerList.add(new Player("Ricky","football", "defensive end",5));
        playerList.add(new Player("James","football", "running back",3));
        playerList.add(new Player("Zach","baseball", "catcher",1));
        playerList.add(new Player("Johnny","football", "offensive line",4));
        playerList.add(new Player("Dennis","football", "safety",5));
        playerList.add(new Player("William","football", "quarterback",2));
        playerList.add(new Player("Billy","football", "running back",1));
        playerList.add(new Player("Brian","basketball", "point guard",4));
        playerList.add(new Player("Jeff","baseball", "shortstop",3));
        playerList.add(new Player("George","football", "linebacker",2));
        playerList.add(new Player("Carl","football", "cornerback",3));
        playerList.add(new Player("Danny","basketball", "small forward",5));
        playerList.add(new Player("Andy","football", "running back",4));
        playerList.add(new Player("Damien","football", "safety",3));
        playerList.add(new Player("Harman","baseball", "left field",2));
        playerList.add(new Player("Juan","baseball", "catcher",5));
        playerList.add(new Player("Drew","football", "linebacker",4));

    }

    public List<Player> getPlayerList() {return playerList;}
}
