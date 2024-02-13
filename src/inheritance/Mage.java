package inheritance;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import characters.Character;

public class Mage extends Character{
    
    private int mana;
    private ArrayList<String> spells = new ArrayList<String>();
    
    public Mage(String name, int dexterity, int strength, int mana) {
        super(name, dexterity, strength);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void addSpell(String spellName) {
        this.spells.add(spellName);
    }

    @Override
    public void save(String filename) throws FileNotFoundException {
        File file = new File(filename);
        PrintWriter writer = new PrintWriter(file);

        writer.write(this.getName() + "," + this.getDexterity() + "," + this.getStrength() + "," + this.mana + "," + this.spells);

        writer.close();
    }
}
