import java.util.Scanner;

public class LoginSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for username and password
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Check login credentials
        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Credentials. Please try again.");
        }

        sc.close();
    }
}

