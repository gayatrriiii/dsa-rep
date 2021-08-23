import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Please enter a number: ");
        double num1 = in.nextDouble();
        System.out.print("Please enter another number: ");
        double num2 = in.nextDouble();

        System.out.print("Please select any one operator from +, -, /, *: ");
        char operator = in.next().charAt(0);

        int result;

        if(operator == '+'){
            result = (int) (num1 + num2);
            System.out.println("The addition of two numbers is: "+ result);
        }

        if(operator == '-'){
            result = (int) (num1 - num2);
            System.out.println("The subtraction of two numbers is: "+result);
        }

        if(operator == '*') {
            result = (int) (num1 * num2);
            System.out.println("The multiplication of two numbers is: " + result);
        }
        if(operator == '/') {
            result = (int) (num1 / num2);
            System.out.println("The divison of two numbers is: " + result);
        }
    }
}
