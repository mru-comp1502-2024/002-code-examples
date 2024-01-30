package characters;

public class CharacterController {
    


    public static void main(String[] args) {

        CharacterCreatorInterface userInterface = new CharacterCreatorInterface();

        String name = userInterface.getCharacterName();
        int strength = userInterface.getCharacterStrength();
        int dexterity = userInterface.getCharacterDexterity();

        Character theCharacter = new Character(name, dexterity, strength);
        

    }

}
