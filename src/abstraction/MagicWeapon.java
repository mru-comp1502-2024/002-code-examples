package abstraction;

public class MagicWeapon  extends RangedWeapon {

    private int manaCost;

    public MagicWeapon(String name, int damage, int range, int manaCost) {
        super(name, damage, range);
        this.manaCost = manaCost;
    }    
    
    @Override
    public void save(String filename) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}
