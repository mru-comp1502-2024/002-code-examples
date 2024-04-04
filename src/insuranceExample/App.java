package insuranceExample;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        // better would be to move all this user interaction stuff to it's own class
        // (better separation-of-concerns)
        Scanner keyboard = new Scanner(System.in);

        System.out.println("is this a home claim? (y/n) ");
        boolean home = keyboard.nextLine().equals("y");

        System.out.println("is this a auto claim? (y/n) ");
        boolean auto = keyboard.nextLine().equals("y");

        System.out.println("have you made a claim in the last 3 months? (y/n) ");
        boolean recent = keyboard.nextLine().equals("y");

        Claim claim = new Claim(home, auto, recent);


        // now shop the claim around to the various departments
        Department[] departments = {
            new AutoDept(),
            new HomeDept(),
            new FraudDept()
        };

        for (Department d : departments) {
            if (d.canAccept(claim)) {
                System.out.println(d);
            }
        }
    }
}
