package abstraction;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Fighter extends Character {

    private int speed;

    public Fighter(String name, int health, int speed) {
        super(name, health);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return this.getName() + ", the fighter";
    }
    
    @Override
    public void save(String filename) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(filename);
        writer.print(this.getName() + "," + this.getHealth() + "," + this.getSpeed());
        writer.close();
    }
}
