package SimpleClasses;

import java.util.Random;


public class Coin {
    //____ data attributes ____
    private String sideUp; // current coin state
    private Random rnd = new Random(); // random number generator

    /** constructor */
    public Coin(String state) {
        this.sideUp = state;
    }

    /** alternate (overload) constructor for if you don't want to specify the starting state*/
    public Coin() {
        this.sideUp = "tails";
    }

    /** method to randomly change coin state */
    public void toss() {
        // get
        int randInt = this.rnd.nextInt(2);
        this.sideUp = randInt == 0 ? "heads" : "tails";
    }

    /** method to return current state */
    public String getSideUp() {
        // return the current state of the coin
        return this.sideUp;
    }

    public void setSideUp(String newValue) {
        if (newValue.equals("heads") || newValue.equals("tails")) {
            this.sideUp = newValue;
        }
    }
}

