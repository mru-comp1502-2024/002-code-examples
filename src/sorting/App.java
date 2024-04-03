package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    
    public static void main(String[] args) {
        
        Dancer d1 = new Dancer(9);
        Dancer d2 = new Dancer(7);
        Dancer d3 = new Dancer(8);
        Dancer d4 = new Dancer(5);

        ArrayList<Dancer> dancers = new ArrayList();
        dancers.add(d1);
        dancers.add(d2);
        dancers.add(d3);
        dancers.add(d4);
        
        System.out.println("original order: " + dancers);
        dancers.sort(new DancerComparator());
        System.out.println("after sorting: " + dancers);
    }
}
