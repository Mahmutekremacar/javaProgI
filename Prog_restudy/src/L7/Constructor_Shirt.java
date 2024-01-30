package L7;

public class Constructor_Shirt {
    public static String color;
    public static char size;
    public Constructor_Shirt(String color, char size){
        this.color = color;
        this.size= size;
    }

    public static void putOn(){
        System.out.println("Shirt is on!");
    }
    public static void takeOff(){
        System.out.println("Shirt is off!");
    }
//    public static void setColor(String newColor)
//    {
//        color = newColor;
//    }
//    public static void setSize(char newSize)
//    {
//        size = newSize;
//}

}
