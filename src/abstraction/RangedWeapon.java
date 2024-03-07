package abstraction;

import java.io.FileNotFoundException;

public class RangedWeapon extends Weapon {
    
    private int range;

    public RangedWeapon(String name, int damage, int range) {
    super(name, damage);
    this.range = range;
    }
    
    @Override
    public void save(String filename) throws FileNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    
}
