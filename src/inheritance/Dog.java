package inheritance;

public class Dog extends Vertebrate {
    
    private boolean shedsOnCarpet;
    private String name;

    public Dog(boolean shedsOnCarpet, String name) {
        super(10);
        this.shedsOnCarpet = shedsOnCarpet;
        this.name = name;
    }

    public boolean isShedsOnCarpet() {
        return shedsOnCarpet;
    }

    public void setShedsOnCarpet(boolean shedsOnCarpet) {
        this.shedsOnCarpet = shedsOnCarpet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
