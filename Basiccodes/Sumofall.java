import java.util.Scanner;

public class Sumofall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to continue or press 'x' to quit: ");

        int sum = 0;
        int n;

        while((n = input.nextInt()) != 'x'){
            sum = sum + n;
        }
        System.out.println("Sum of all the numbers is: "+ sum);
    }
}