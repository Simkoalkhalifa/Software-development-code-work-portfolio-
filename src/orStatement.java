public class orStatement {
    public static void main(String[] args) {
        String order = "black";

        if ( order == "black" || order == "black") {
            System.out.println("Order granted, yes the shoe colour available is  black...");
        } else {
            System.out.println("Shoe colour is not black");
        }
    }
}