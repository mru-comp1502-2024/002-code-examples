package inheritance;

import java.io.FileNotFoundException;
import characters.Character;
import java.util.*;


public class CharacterDemo {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println(Arrays.asList(args));
        // pollymorphism
        Character harryPotter = new Mage("harry", 5, 6, 4);
    }

}
