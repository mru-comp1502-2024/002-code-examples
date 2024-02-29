package abstraction;

import java.io.FileNotFoundException;

public interface Saveable {
    
    /**
     * Method that saves the object to a file
     * all classes that implement Saveable must have a "save" method
     * @param filename
     */
    public void save(String filename) throws FileNotFoundException;
}
