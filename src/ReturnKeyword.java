// question 6 work book 5
public class ReturnKeyword {
    // my method to add int number + 5
    static int add (int x) {
        return 5 + x;
    }

    // my method to substract x to 5
    static int minus(int x){
        return x - 5;
    }// create method to multiply x * 5
    static int multiply(int x){
        return x * 5;
    }
    // create method to divide x /5
    static int divide(int x){
        return x / 5;
    }





    //main method
    public static void main(String[] args) {
        // method add calling and passing number 10 to x
        System.out.println( add(10)); // 5 + 10 = 15
        // method minus calling and passing number 10 to x
        System.out.println( minus(10));
        System.out.println( multiply(10));// 10-5 = 5
        System.out.println( divide(10));
        // method multiplication calling, passing number 10

        // method division calling, passing number 10


    }
}