package calculate;

public class Calculator {
    // instance method for addition of two value
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is: " + (a + b));
    }

    // instance method for subtraction of two value
    public void subtraction(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }

    // instance method for division of two value
    public void division(int a, int b) {
        System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
    }

    // instance method for multiplication of two value
    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
    }

    public void calculateResult(int a, int b, char symbol) {
        double result;
        switch (symbol) {

            // performs addition between numbers
            case '+':
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
