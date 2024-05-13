package homework_week5;
/**
 * 3. Write a Java program to reverse an array of integer values.
 */

import java.util.Arrays;

public class Program3_ReverseArray {
    public static void main(String[] args) {

        reverseArray();
    }

    public static void reverseArray() {
        int a[] = new int[10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        a[8] = 9;
        a[9] = 10;

        // Print the original array using Arrays.toString() method.
        System.out.println("Original array : " + Arrays.toString(a));

        // Iterate through the first half of the array and reverse its elements.
        for (int i = 0; i < a.length / 2; i++) {
            // Swap the elements at positions 'i' and 'length - i - 1'.
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

        // Print the reversed array using Arrays.toString() method.
        System.out.println("Reverse array : " + Arrays.toString(a));

    }


}


