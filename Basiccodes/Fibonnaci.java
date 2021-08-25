import java.util.Scanner;

public class Fibonnaci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number for nth term: ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b = b + a ;
            a = temp;
            count ++ ;
        }
        System.out.println("The value is: " + b);
    }
}
