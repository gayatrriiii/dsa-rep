import java.util.Scanner;

public class Largestno {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num1 = in.nextInt();

        System.out.print("Please enter another number: ");
        int num2 = in.nextInt();

        if (num1 >= num2) {
            System.out.println("The larger number is: " + num1);
        } else System.out.println("The larger number is: " + num2);

    }
}
















