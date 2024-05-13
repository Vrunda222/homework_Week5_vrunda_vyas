package homework_week5;
/**
 * 11. Declare following two arrylist and compare it.
 *
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

import java.util.ArrayList;

public class Program11_CompareTwoArrayList {
    public static void main(String[] args) {
        compareArray();
    }

    public static void compareArray() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        //comparing both lists
        boolean boolval = c1.equals(c2); //returns true because lists are equal
        if(boolval == false){
            System.out.println("Array list is not equal.");
        }else{
            System.out.println("Array list is equal.");
        }
    }
}
