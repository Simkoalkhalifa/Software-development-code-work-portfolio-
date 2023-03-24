public class Carsforsale {

    public static void main(String[] args) {

        int[] carPrices = {12000, 34000, 56000, 15450, 45000};
        for (int i = 0; i < carPrices.length; i++) {

            System.out.println(carPrices[i]);
        }
        carPrices[0] = 12657;
        carPrices[4] = 45000;
        System.out.println("print updated values");
        for (int i = 0; i < carPrices.length; i++){
            System.out.println(carPrices[i]);
        }
    }


}