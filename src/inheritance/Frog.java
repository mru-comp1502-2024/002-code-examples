package inheritance;

public class Frog extends Vertebrate {
    
    private boolean isPoisonous;

    public Frog(boolean isPoisonous) {
        super(5);
        this.isPoisonous = isPoisonous;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    

}
