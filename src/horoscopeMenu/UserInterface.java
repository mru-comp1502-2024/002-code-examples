package horoscopeMenu;

import java.util.Scanner;

/** this class has the job of interacting with the user */
public class UserInterface {
    
    private Scanner keyboard = new Scanner(System.in);

    /** get the user's star sign */
    public String getStarSign() {
        System.out.print("enter your star sign: ");
        return this.keyboard.nextLine();
    }

    /** get the user's moon sign */
    public String getMoonSign() {
        System.out.print("enter your moon sign: ");
        return this.keyboard.nextLine();
    }

    /** get the user's element */
    public String getElement() {
        System.out.print("enter your element: ");
        return this.keyboard.nextLine();
    }

}
