package chapter20.example2;

import java.util.ArrayList;

public abstract class ControlCenter {
    protected String name ;
    protected ArrayList<MYObserver> players =  new ArrayList<MYObserver>();

    public ControlCenter() {
    }

    public ControlCenter(String name) {
        this.name = name;
    }

    public void join(MYObserver observer){
        players.add(observer);
        observer.setCenter(this);
    }
    public void quit(MYObserver observer){
        players.remove(observer);
    }

    public abstract void notifyPlayer(String name);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MYObserver> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<MYObserver> players) {
        this.players = players;
    }
}
