import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int a = input.nextInt();

        System.out.print("Please enter another number: ");
        int b = input.nextInt();

        int sum;

        sum = a + b ;
        System.out.println("Sum of two numbers is: " + sum);

    }
}
