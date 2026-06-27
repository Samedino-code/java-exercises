
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the Gift");
        int value1 = scan.nextInt();
        
        if (value1 < 5000) {
            System.out.println("No tax!");
            
        } else if (value1 < 25000) {
            double tax = (100 + (value1 - 5000)* 0.08);
            System.out.println("Tax: " + tax);
            
        } else if (value1 < 55000) {
            double tax = (1700 + (value1 - 25000)* 0.10);
            System.out.println("Tax: " + tax);
            
        } else if (value1 < 200000) {
            double tax = (4700 + (value1 - 55000)* 0.12);
            System.out.println("Tax: " + tax);
            
        } else if (value1 < 1000000) {
            double tax = (22100 + (value1 - 200000)* 0.15);
            System.out.println("Tax: " + tax);
            
        } else {
            double tax = (142100 + (value1 - 1000000)* 0.17);
            System.out.println("Tax: " + tax);
        }

    }
}

