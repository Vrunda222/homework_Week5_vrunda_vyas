package homework_week5;
/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Program7_FindOutArrayListIsEmptyOrNot {
    public static void main(String[] args) {
        arrayEmptyOrNot();
    }

    public static void arrayEmptyOrNot() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Checking the above array list is empty or not! " + c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements " + c1);
        System.out.println("Checking the above array list is empty or not! " + c1.isEmpty());
    }
}
