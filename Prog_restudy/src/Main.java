import L7.Constructor_Shirt;
import java.time.*;
import java.util.Date;

import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


    public class Main {

        public static void main(String[] args) {
            // Get the current date and time using LocalDateTime class
            LocalDateTime currentDateTime = LocalDateTime.now();
            System.out.println("Current Date and Time (java.time): " + currentDateTime);
            Date currentDate = new Date();
            System.out.println("Current Date and Time (util.Date): " + currentDate);
        }
    }

