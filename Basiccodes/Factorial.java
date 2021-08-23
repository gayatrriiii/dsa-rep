import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n;
        n = input.nextInt();
        int factor = 1;

        for(int count = 1; count <= n; count++){
          factor = factor * count;
        }
        System.out.print("Factorial of number: "+ factor);
    }
}
