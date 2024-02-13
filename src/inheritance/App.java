package inheritance;

public class App {
    
    public static void main(String[] args) {
        Dog myDog = new Dog(true, "Stirling");
        System.out.println(myDog.isSexualReproduction());

        Frog kermit = new Frog(false);
        
    }
}
