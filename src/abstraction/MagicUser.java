package abstraction;

public interface MagicUser {
    
    /**
     * getter for a "mana" attribute
     * @return the object's mana score
     */
    public abstract int getMana();

    /**
     * setter for a "mana" attribute
     * @param value - the new mana score
     */
    public abstract void setMana(int value);
}
