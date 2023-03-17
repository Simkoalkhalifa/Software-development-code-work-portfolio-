public class SumAvgArray {
    public static void main(String[] args) {
        int[] numbers = {23,24,44,55,65,75,87,98,56,76};

        for (int i = 0; i<numbers.length; i++)
            System.out.println(numbers[i] + " ");
            System.out.println("Add all these numbers together");
            for (int data:numbers){
                System.out.print(data + " ");
            }
            // calculate the sum
            System.out.println("\nCalculating sum in progress....");
            int sum =0; // will remember the sum of the two indexes
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i]; // sum += numbers[i]
                System.out.println(sum);
            }

            System.out.println("The total sum is " + sum);

        double average = (double)sum/10;
        System.out.println("average"+average);
        }

    }
