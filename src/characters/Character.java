package characters;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/** represents a game character */
public class Character {
    
    private String name;
    private int dexterity;
    private int strength;
    
    /**
     * Constructor for the character object
     * @param name - this charaacter's name
     * @param dexterity - this character's dex
     * @param strength - this character's strength
     */
    public Character(String name, int dexterity, int strength) {
        this.name = name;
        this.dexterity = dexterity;
        this.strength = strength;
    }

    /**
     * alternate constructor for loading a previously-saved character object
     * @param filename - filename where character was saved (using save method)
     * @throws FileNotFoundException
     */
    public Character(String filename) throws FileNotFoundException {
        File filePath = new File(filename);
        Scanner file = new Scanner(filePath);

        String line = file.nextLine();
        String[] characterStats = line.split(",");

        this.name = characterStats[0];
        this.dexterity = Integer.parseInt(characterStats[1]);
        this.strength = Integer.parseInt(characterStats[2]);
    }

    public String getName() {
        return name;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getStrength() {
        return strength;
    }

    /**
     * Saves this character's data to a file
     * @param filename
     * @throws FileNotFoundException
     */
    public void save(String filename) throws FileNotFoundException {
        File file = new File(filename);
        PrintWriter writer = new PrintWriter(file);

        writer.write(this.name + "," + this.dexterity + "," + this.strength);

        writer.close();
    }

    /** overloaded save method - names the file after Character */
    public void save() throws FileNotFoundException {
        this.save(this.name + ".txt");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Character c = new Character("eric", 10, 1);
        c.save("testFile.txt");

        Character eric = new Character("testFile.txt");
    }

}
