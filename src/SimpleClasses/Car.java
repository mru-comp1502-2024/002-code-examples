package SimpleClasses;

public class Car {
    
    String make;
    String model;
    int year;
    int odometer;

    /** constructor for the Car object */
    public Car(String make, String model, int year, int odometer) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometer = odometer;
    }

    /**
     * Call this method to "drive" the car (increment its odometer)
     * @param distance - the distance driven (in km)
     * @return the new odometer reading
     */
    public int drive(int distance) {
        return this.odometer += distance;
    }

    /**
     * toString methods are automatically called whenever our object is converted to a string
     * (e.g. for printing to the terminal)
     */
    public String toString() {
        return this.year + " " + this.make + " " + this.model + " with " + this.odometer + "km";
    }

}
