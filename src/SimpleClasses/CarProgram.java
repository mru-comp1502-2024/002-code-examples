package SimpleClasses;

/** this program demonstrates use of the Car class */
public class CarProgram {
    
    public static void main(String[] args) {
        
        // create an instance of the Car object
        Car myCar = new Car("Aston Martin", "DB5", 1964, 250000);
                        
        // print the car before and after invoking the "drive" method
        System.out.println(myCar.getOdometer());
        myCar.drive(999);
        System.out.println(myCar.getOdometer());

        // create another instance of the Car object
        Car car2 = new Car("BMW", "M8", 2024, 3);

        // create a Fleet object to store the cars
        Fleet myFleet = new Fleet();
        myFleet.addCar(myCar);
        myFleet.addCar(car2);
        
    }

}
