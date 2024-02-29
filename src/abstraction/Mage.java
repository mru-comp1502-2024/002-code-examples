package abstraction;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Mage extends Character implements MagicUser {
    
    private int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        this.mana = mana;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void setMana(int value) {
        this.mana = value;
    }

    @Override
    public String toString() {
        return this.getName() + ", the mage";
    }

    @Override
    public void save(String filename) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(filename);
        writer.print(this.getName() + "," + this.getHealth() + "," + this.getMana());
        writer.close();
    }

}
