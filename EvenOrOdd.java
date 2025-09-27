import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for an integer
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Check if the number is even or odd using modulo operator
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        sc.close();
    }
}

