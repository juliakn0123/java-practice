import java.util.Arrays;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 27, 8, 16};
        if (numbers.length == 0) {
            System.out.println("The arrays list is empty");
        } else {
            int min = numbers[0];
            int max = numbers[0];
            int sum = 0;
            double average = 0;


            for (int i = 0; i < numbers.length; i++) {
                if (min > numbers[i]) {
                    min = numbers[i];
                } else if (max < numbers[i]) {
                    max = numbers[i];
                    sum = sum + numbers[i];
                    average = (double) sum / numbers.length;

                }

            }

            System.out.println("Array: " + Arrays.toString(numbers));
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        }

    }

}

