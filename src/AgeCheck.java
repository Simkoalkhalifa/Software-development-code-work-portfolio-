


public class AgeCheck {

        public static void main(String[] args) {
            int age = 44;
            if (age >= 0 && age < 18)
            {
                System.out.println("You are too young for this game");
            }
            else if (age >= 18)
            {
                System.out.println("Enter granted !");
            }
            else {
                System.out.println("You entered wrong number");
            }
        }
}
