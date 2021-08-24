import java.util.Scanner;

public class print1ton {
    public static void main(String[] args) {

        System.out.print("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n ; num++) {
            System.out.print(num + " ");
        }
    }
}



