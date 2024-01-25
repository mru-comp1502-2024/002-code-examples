package SimpleClasses;

import java.util.Random;


public class Coin {
    //____ data attributes ____
    String sideUp; // current coin state
    Random rnd = new Random(); // random number generator

    /** constructor */
    public Coin(String state) {
        this.sideUp = state;
    }

    /** method to randomly change coin state */
    public void toss() {
        // get
        int randInt = this.rnd.nextInt(2);
        this.sideUp = randInt == 0 ? "heads" : "tails";
    }

    /** method to return current state */
    public String getSideUp() {
        // return the
        return this.sideUp;
    }
}

