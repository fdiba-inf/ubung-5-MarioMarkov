package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        for (int j = 0; j < numbers.length; j++){
            for (int i = 0; i < numbers.length -1; i++){
                int temp =0;
                if (numbers[i]<numbers[i+1]) {
                    temp = numbers[i];

                    numbers[i] = numbers[i + 1];

                    numbers[i + 1] = temp;
                }

                }
            }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Sorted numbers: " + numbersAsString);
    }
}
