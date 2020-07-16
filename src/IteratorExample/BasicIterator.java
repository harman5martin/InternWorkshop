package src.src.IteratorExample;

import java.util.Iterator;

public class BasicIterator {
    public static void main(String[] args) {
        PlayerList playerList = new PlayerList();

        Iterator<Player> playerIterator = playerList.getPlayerList().iterator();

        while(playerIterator.hasNext()) {
            Player nextPlayer = playerIterator.next();
            PrintOutInformation(nextPlayer);
        }
    }

    public static void PrintOutInformation(Player nextPlayer) {
        System.out.println("-------------------");
        System.out.println(nextPlayer.getName());
        System.out.println(nextPlayer.getSport());
        System.out.println(nextPlayer.getPosition());
        System.out.println(nextPlayer.getRating());
        System.out.println("-------------------");
    }
}
