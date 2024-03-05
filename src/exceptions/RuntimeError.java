package exceptions;

import java.util.Scanner;

public class RuntimeError {
    
    public static void main(String[] args) throws NoEricsException {
        System.out.print("enter your name: ");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();

        if (name.equals("eric")) {
            throw new NoEricsException();
        }
    }
}
