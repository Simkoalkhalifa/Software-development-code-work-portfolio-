import java.util.Random;
public class Dice {

    public static void main(String[] args) {

        Random random= new Random();
        int x= random.nextInt(10) + 1;
        System.out.println(x);

        int y= random.nextInt(10) + 1;
        System.out.println(y);

        System.out.println("two dice for the price of one");


    }



}
