package abstraction;

import java.io.FileNotFoundException;

public class GameManager {
    
    /** accepts any saveable object and writes it to a file 
     * @throws FileNotFoundException*/
    public void save(String filename, Saveable object) throws FileNotFoundException {
        object.save(filename);
    }
}
