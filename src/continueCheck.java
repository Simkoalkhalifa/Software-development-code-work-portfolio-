import java.util.Scanner;

public class continueCheck {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        // ask the user if they want to continue playing
        System.out.println("Do you want to continue playing? ");
        String text = reader.nextLine();

        if (! ( text.equals("yes"))) {
            System.out.println("The game will end here. See you soon.");
        } else {
            System.out.println( "Stay in the game.");
        }

    }
}