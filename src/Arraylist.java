import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> Age = new ArrayList<Integer>();

        Age.add(10);

        Age.add(15);

        Age.add(20);

        for (int i : Age) {
            System.out.println(i);

            System.out.println(" Age ");

        }
    }
}