package horoscopeMenu;

public class App {
    

    public static void main(String[] args) {

        UserInterface ui = new UserInterface();    
        String starSign = ui.getStarSign();

        if (starSign.equals("virgo")) {
            String moonSign = ui.getMoonSign();

            if (moonSign.equals("virgo")) {
                System.out.println("you will pass your 1502 quiz");
            }
            else if (moonSign.equals("pisces")){
                System.out.println("you will almost pass your 1502 quiz");
            }
        }

        if (starSign.equals("pisces")) {
            String element = ui.getElement();

            if (element.equals("fire")) {
                System.out.println("you will pass your 1502 quiz");
            }
            else if (element.equals("water")){
                System.out.println("you will almost pass your 1502 quiz");
            }
        }


    }
}
