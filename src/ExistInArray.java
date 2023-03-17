
import java.util.Scanner;
public class ExistInArray {
        public static void main(String[]args) {
// create scanner object
            Scanner reader= new Scanner(System.in);
            // create int array numbers[] with 10 numbers inside
            int[] numbers= {23,24,44,55,65,75,87,98,56,76};
        boolean userGuess= false;
            // ask user to guess the number
            System.out.println("can you guess the number");
            // save user input, int guess = reader.nextInt()
            int guess = reader.nextInt();

            for(int number: numbers) {
                if(number == guess) {
                    userGuess = true;
                    break;
                }
                    if (userGuess) {
                        System.out.println(guess + "has been found in the Array");
                    } else {
                        System.out.println(guess + "has not been found in the Array");
                    }
                }
            }





            // use for loop to access your array, if numbers[i] == guess, you found the number

            // print if guess not available, say your guess is incorrect, otherwise say you guessed my numbers.
            // create int array numbers[] with 10 numbers inside

            // ask user to guess the number

            // save user input, int guess = reader.nextInt()

            // use for loop to access your array, if numbers[i] == guess, you found the number

            // print if guess not available, say your guess is incorrect, otherwise say you guessed my numbers.



        }




