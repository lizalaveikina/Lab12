package apps.ucu.edu.ua.task1;

public abstract class Tray {

    private int denomination;
    private Tray next;

    public Tray(int denomination){
        this.denomination = denomination;
    }

    public void setNext(Tray tray){
        this.next = tray;
    }

    public void process(int amount){
        // System.out.println("You should take " + amount / denomination + " of denomination " + denomination);
        if (next != null){
            next.process(amount % denomination);
            // System.out.println("You should take " + amount / denomination + " of denomination " + denomination);
        }
        
        else if(amount % denomination > 0){
            throw new IllegalArgumentException();
        }
        System.out.println("You should take " + amount / denomination + " of denomination " + denomination);
    }
}
