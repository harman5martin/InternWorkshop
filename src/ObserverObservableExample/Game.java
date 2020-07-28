package src.src.ObserverObservableExample;

public interface Game {
    public void addObserver(GameObserver o);
    public void deleteObserver(GameObserver o);
    public void notifyObservers(String whoScored);
    public void scorePoints(String team, int points);
    public void printScore();
    public String whoIsWinning();
}
