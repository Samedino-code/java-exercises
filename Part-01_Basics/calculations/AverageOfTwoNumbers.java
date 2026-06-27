
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int z1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int z2 = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (double)(z1+z2)/2);

    }
}
