package inheritance;

public class Vertebrate extends Animal {
    
    private int numberOfVertebrae;

    public Vertebrate(int numberOfVertebrae) {
        super(true);
        this.numberOfVertebrae = numberOfVertebrae;
    }

    public int getNumberOfVertebrae() {
        return numberOfVertebrae;
    }

    public void setNumberOfVertebrae(int numberOfVertebrae) {
        this.numberOfVertebrae = numberOfVertebrae;
    }

}
