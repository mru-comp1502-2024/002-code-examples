package SimpleClasses;

/** this program demonstrates use of the Car class */
public class CarProgram {
    
    public static void main(String[] args) {
        
        // create an instance of the Car object
        Car myCar = new Car("Aston Martin", "DB5", (short) 1964, 250000);
        
        // print the car before and after invoking the "drive" method
        System.out.println(myCar);
        myCar.drive(999);
        System.out.println(myCar);
    }

}
