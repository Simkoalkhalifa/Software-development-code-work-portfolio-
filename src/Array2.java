public class Array2 {
    public static void main(String[] args) {

        String [][] Famouspeople = {

                {"Chris", "Rock", "M"},
                {"Rowan", "Atkinson", "M"},
                {"Judi", "Dench", "F"}
        };

        // PRINT ALL ELEMENTS
        for (int i=0; i < Famouspeople.length; i++) { // row counter
            for (int j=0; j < Famouspeople[i].length; j++) { // column counter
                System.out.print(Famouspeople[i][j] + " ");
            }
            System.out.println( "");




        }
    }
}