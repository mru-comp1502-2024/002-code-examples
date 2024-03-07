package abstraction;

import java.io.FileNotFoundException;

public abstract class Weapon implements Saveable {

    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    
}
