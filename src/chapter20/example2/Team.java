package chapter20.example2;

public class Team extends ControlCenter{

    public Team(String name) {
        super(name);
    }

    @Override
    public void notifyPlayer(String name) {
        for (MYObserver o:players) {
            if (!o.getName().equalsIgnoreCase(name)){
                o.help();
            }
        }
    }
}
