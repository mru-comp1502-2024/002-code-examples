package SimpleClasses;
import java.util.ArrayList;

/** class that represents a fleet of Car objects */
class Fleet {

    private ArrayList<Car> fleet = new ArrayList<Car>();

    /**
     * method to add a new Car object to the Fleet
     * @param car - the car to add
     */
    public void addCar(Car car) {
        this.fleet.add(car);
    }

    /**
     * @return the current size of the fleet (count of cars in the list)
     */
    public int getSize() {
        return this.fleet.size();
    }
}