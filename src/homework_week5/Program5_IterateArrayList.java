package homework_week5;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

import java.util.ArrayList;
import java.util.List;

public class Program5_IterateArrayList {

    public static void main(String[] args) {
        iterateArray();
    }

    public static void iterateArray() {
        // Create a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        for (String element : list_Strings) {
            System.out.println(element);
        }
    }
}
