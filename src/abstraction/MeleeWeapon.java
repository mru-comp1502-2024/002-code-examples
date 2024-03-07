package abstraction;

import java.io.FileNotFoundException;

public class MeleeWeapon extends Weapon {


    public MeleeWeapon(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void save(String filename) throws FileNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    
}