package characters;

import java.util.Scanner;

public class CharacterCreatorInterface {
    
    private Scanner keyboard = new Scanner(System.in);

    /** this method gets the character's name from the user */
    public String getCharacterName() {
        System.out.println("enter your character's name: ");
        return this.keyboard.nextLine();
    }

    public int getCharacterDexterity() {
        System.out.println("enter your character's dexterity score: ");
        return Integer.parseInt(this.keyboard.nextLine());
    }

    public int getCharacterStrength() {
        System.out.println("enter your character's strength score: ");
        return Integer.parseInt(this.keyboard.nextLine());
    }
}
