import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("REVERSE NAME GENERATOR");
        System.out.println("Enter a name?");

        char[] letters = reader.nextLine().toCharArray();

            // use for loop to print original name
            for (int i = letters.length-1; i>= 0 ; i--) {

                System.out.println(letters[i]);


            }




    }
}



// get the user input, type casting from String to Char with .charAt()

        // use for loop to print original name

        // use for loop to print name in reverse

// use for loop to print name in reverse, hint use i--, starts from the letters.length-1 to 0