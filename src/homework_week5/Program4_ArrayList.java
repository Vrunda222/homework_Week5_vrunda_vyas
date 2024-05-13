package homework_week5;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Program4_ArrayList {
    public static void main(String[] args) {

        colorsString();
        }
        public static void colorsString(){
            java.util.ArrayList<String> color = new java.util.ArrayList();
            color.add("Green");
            color.add("Yellow");
            color.add("Black");
            color.add("Red");

            for (String c : color) {
                System.out.print(c + " ");
            }
        }
    }

