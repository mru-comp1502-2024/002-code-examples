package abstraction;

public abstract class Character implements Saveable{

    private String name;
    private int health;

    
    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getHealth() {
        return health;
    }

    
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * abstract toString method - all subclasses must implement separately
     * @return a string representation of the character 
     */    
    public abstract String toString();
    
}
