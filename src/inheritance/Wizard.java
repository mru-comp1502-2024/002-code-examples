package inheritance;

public class Wizard extends Mage {

    public Wizard(String name, int dexterity, int strength, int mana) {
        super(name, dexterity, strength, mana);
    }

    @Override
    public String getName() {
        return super.getName() + ", the wizard";
    }

    public static void main(String[] args) {
        Wizard w = new Wizard("harry potter", 10, 5, 6);
        System.out.println(w.getName());        
    }
}
