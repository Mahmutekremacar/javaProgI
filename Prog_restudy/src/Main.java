import L7.Constructor_Shirt;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Constructor_Shirt s = new Constructor_Shirt("White", 'S');
        /*
        s.setColor("White");
        s.setSize('S');
         */

        System.out.println(s.size);
        s.putOn();
        s.takeOff();






        }
    }
