package homework_week5;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Program8_HashSet {
    public static void main(String[] args) {
        hashSet();
    }

    public static void hashSet() {
        HashSet<Integer> number = new HashSet();
        number.add(4);
        number.add(7);
        number.add(8);
        //number.add(11);
        //number.add(50);

        System.out.println(number);

        for (Integer num : number) {
            if(num >= 1 && num <=10) {
                System.out.println(num + " is between 1 and 10 ");
            }else{
                System.out.println(num + " is not between 1 and 10 ");
            }
        }
    }
}
