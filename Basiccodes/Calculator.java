import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user presses x or X
        int ans = 0;

        while (true) {
            //Take operator as input
            System.out.print("Please enter an operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //Input two numbers

                System.out.print("Please enter two numbers: ");
                int a = in.nextInt();
                int b = in.nextInt();
                // Checking

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
              } else if (op == 'x' || op == 'X') {
                break;
            } else{
                System.out.println("Invalid operation!");
            }
                System.out.println("The answer is: " + ans);
        }
    }
}
