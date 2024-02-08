import java.util.ArrayList;

public class ArrayVsArrayList {
    
    public static void main(String[] args) {

        char[] letters = {'a', 'b', 'c'}; // could also say new char[3]
        letters[2] = 'd';
        System.out.println(letters[2]);
        
        ArrayList<Character> lettersList = new ArrayList<Character>();
        lettersList.add('a');
        lettersList.add('b');
        lettersList.add('c');
        System.out.println(lettersList.get(2));
        lettersList.set(2, 'd');
        System.out.println(lettersList.get(2));

        for (char letter : lettersList) {
            if (letter == 'd') {
                System.out.println("d is in the list!");
            }
        }

        // different ways of getting the length/size
        String message = "hello";
        message.length();
        int length = letters.length;
        lettersList.size();

        
    }
}
