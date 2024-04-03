package staticExamples;
import java.util.ArrayList;

public class EnrollmentList extends ArrayList<String> {
    
    public static void main(String[] args) {
        EnrollmentList list1 = new EnrollmentList();
        list1.add("enrollment 1");
        
        EnrollmentList list2 = new EnrollmentList();
        list2.add("enrollment 2");
    }

}
