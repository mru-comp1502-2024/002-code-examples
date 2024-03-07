package stringArgsDemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo {
    
    public static void main(String[] args) {
        // print length of the args array
        System.out.println("args length: " + args.length);

        // print contents of the args array
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
