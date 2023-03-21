import java.util.Scanner;

public class ProtectedMoneyChecker { // PUBLIC CLASS START
    public static void main(String[] args) { //MAIN METHOD START
        Scanner reader = new Scanner (System.in);
        System.out.println("Enter your balance : ");
        int balance = reader.nextInt();

        // check the balance, 0- 85000, print protected, otherwise not protected
        if (balance>=0 && balance<=85000){
            System.out.println("Yes");
        }
        else {
            System.out.println("Not protected");
        }


    } // END OF METHOD
} // END OF