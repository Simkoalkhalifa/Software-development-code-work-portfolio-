
import java.util.Scanner;
public class SumNumbers{
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);

        System.out.print ("Ask user for number to sum?");
    int userInput=reader.nextInt();
    int counter=1;
    int Sumto=0;

    while(counter <= userInput) {
            Sumto = Sumto + counter; // adding the number
            counter = counter + 1; // updating counter
        }
        System.out.println("The total  number from 1 to " + userInput + " is " + Sumto);

    }







}
