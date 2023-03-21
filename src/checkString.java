public class checkString {
    public static void main(String[] args) {
        // check if the word contains yes
        System.out.println("Is the string equal to 'cola'?");
        String text = "cola";

        if (! ( text.equals("cola"))) {
            System.out.println("yes" + text + "  contain cola");
        } else {
            System.out.println( "no " + text + " contains milk");
        }

    }
}