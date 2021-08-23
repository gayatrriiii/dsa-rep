import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = in.nextInt();

        System.out.print("Factors of " + num + " are: ");
        for (int count = 1; count <= num; count++) {
            if (num % count == 0) {
                System.out.print( count + " ");
            }
        }
    }
}
