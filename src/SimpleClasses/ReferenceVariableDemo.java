package SimpleClasses;

import java.util.ArrayList;

public class ReferenceVariableDemo {
    
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<String>();
        int myInt = 42;

        someMethod(myInt, myList);
        System.out.println("done");
    }

    public static void someMethod(int myInt, ArrayList<String> myList) {
        myInt += 100;
        myList.add("hello world");
    }


}
