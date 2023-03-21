
import java.util.Scanner;
public class LoginPage {
    public static void main(String[] args) {
        // create Scanner object
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter username : ");
        // read username
        String username = reader.nextLine();


        System.out.println("Enter password : ");
        // read password
        int password = reader.nextInt();

        // print information
        System.out.println("Your username is " + username);
        System.out.println("Your password is " + password);


    }
}
