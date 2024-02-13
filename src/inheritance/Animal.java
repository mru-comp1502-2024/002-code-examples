package inheritance;

public class Animal {
    
    private boolean sexualReproduction;

    public Animal(boolean sexualReproduction) {
        this.sexualReproduction = sexualReproduction;
    }

    public boolean isSexualReproduction() {
        return sexualReproduction;
    }
}
