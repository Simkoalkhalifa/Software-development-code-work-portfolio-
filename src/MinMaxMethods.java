// 1. Import java scanner

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MinMaxMethods {
    // main method start
    public static void main(String[] args) {
        // 2. create scanner object
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = reader.nextInt();
        // 5. ask user to enter num2
        System.out.println("Enter the second number : ");
        int num2 = reader.nextInt();
        System.out.println("Enter the third number : ");
        int num3 = reader.nextInt();


        System.out.println("You have entered " + num1 + ", " + num2 + " ," + num3 + ".");
        System.out.println("The biggest number is " + maxMethod(num1, num2, num3));
        System.out.println("The smallest number is " + minMethod(num1, num2, num3));
    } // main method ends

    static int maxMethod(int a, int b, int c) {
        if (a > b && a > c) {
            return a; // scenario when a is the biggest
        } else if (b > a && b > c) {
            return b; // scenario when b is the biggest
        } else {
            return c;

        }
    }
    // create method to find the biggest number

    static int minMethod(int a, int b, int c) {
        if (a < b && a < c) {
            return a; // scenario when a is the biggest
        } else if (b < a && b < c) {
            return b; // scenario when b is the biggest
        } else {
            return c;
            // create method to find the smallest number
        }
    }
}