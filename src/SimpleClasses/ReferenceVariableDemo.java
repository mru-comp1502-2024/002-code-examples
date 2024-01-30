package SimpleClasses;

import java.util.ArrayList;

public class ReferenceVariableDemo {
    
    
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<String>();                
        int myInt = 42;

        someMethod(myInt, myList);
    }

    public static void someMethod(int someInt, ArrayList<String> someList) {
        someInt += 100;
        someList.add("hello world");
    }
}
