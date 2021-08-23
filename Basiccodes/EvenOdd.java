import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println("The number is even!");
        }
        else System.out.println("The number is odd!");
    }
}