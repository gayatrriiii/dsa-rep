import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

     // Fibonacci series till 10 numbers
        int b = 0;
        int a = 1;
        int n, i, count = 10 ;

        for(i = 0; i < count; i++){
            n = b + a ;
            System.out.println(" "+ n);
            b = a;
            a = n;
        }

        //Subtract the Product and Sum of Digits of an Integers
        int n1 = in.nextInt();
        int sum = 0;
        int product = 1;

        while(n1 > 0) {
            sum += n1 % 10;
            product *= n1 % 10;
            n1 /= 10;
        }
        System.out.println(product - sum);


  

}
}

