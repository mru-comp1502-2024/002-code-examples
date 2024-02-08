package SimpleClasses;

public class Car {
    
    private String make;
    private String model;
    private int year;
    private int odometer;

    /**
     * constructor for the car class
     * @param make - the make
     * @param model - the model
     * @param year - the year
     * @param odometer - odometer (in km)
     */
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

    /**
     * @return the make
     */
    public String getMake() {
        return this.make;
    }

    public int getOdometer() {
        return this.odometer;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }   

    /**
     * setter for odometer value. Performs validation to ensure value is positive
     * @param odometer - the new odometer reading
     */
    public void setOdometer(int odometer) {
        if (odometer < 0) {
            System.out.println("odometer can't be negative!");
        }
        else {
            this.odometer = odometer;
        }
    }
    
}
