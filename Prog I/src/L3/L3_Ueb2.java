package L3;

public class L3_Ueb2 {
    public static int pizzaRechner(int pizzar_a, int preisa, int pizzar_b, int preisb){
        double pizzaFlaechea =  (3.14159* pizzar_a * pizzar_a);
        double pizzaFlaecheb =  (3.14159* pizzar_b * pizzar_b);
        double angebota = pizzaFlaechea / preisa;
        double angebotb = pizzaFlaecheb / preisb;
        if(angebota > angebotb){
            System.out.println(pizzar_a+" is guenstiger.");
            return pizzar_a;
        }else{
            System.out.println(pizzar_b+" ist guenstiger.");
            return  pizzar_b;
        }


    }
    public static void main(String[] args) {
        pizzaRechner(26, 20 , 28, 24);
        pizzaRechner(26, 20, 30, 26);

    }
    }
    // erledigt

