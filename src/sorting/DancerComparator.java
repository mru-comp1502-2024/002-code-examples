package sorting;

import java.util.Comparator;

public class DancerComparator implements Comparator<Dancer> {

    @Override
    public int compare(Dancer firstDancer, Dancer secondDancer) {
        // this will let us see every time sort() calls this compare() method
        System.out.println("comparing " + firstDancer + " to " + secondDancer); 

        // return a positive number if firstDancer is "greater than" second dancer. negative number otherwise.
        // in this case, easiest to just return the difference in dancer scores
        return firstDancer.getDopeness() - secondDancer.getDopeness();
    }
}
