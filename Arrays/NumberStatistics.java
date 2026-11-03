import java.util.Arrays;

public class NumberStatistics {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 27, 8, 16, 3, 20};
        Arrays.sort(numbers);
        System.out.println("The median is: " + Arrays.toString(numbers));

    }
}
