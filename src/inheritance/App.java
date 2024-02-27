package inheritance;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        Dog myDog = new Dog(true, "Stirling");
        Frog myFrog = new Frog(true);

        // use polymorphism to put both Dog and Frog in the same list
        ArrayList<Animal> list = new ArrayList<Animal>();
        list.add(myDog);
        list.add(myFrog);
        
        // as long as the object is treated like an Animal, we won't have access to Dog members
        Animal a = list.get(0);
        a.isSexualReproduction();
        Dog d = (Dog) a;
        d.setShedsOnCarpet(false);
    }
}
