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


       // Using loops, input a number and print all the factors of that number
        System.out.println("Please enter a number: ");
        int num = in.nextInt();

        for(int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
            }
        }

       // Take integer inputs till the user enters 0 and print the sum of all numbers.

        System.out.println("Enter a number or press 0 to exit: ");
        int sum = 0;
        int num= in.nextInt();
        while((num = in.nextInt()) != 0){
            sum = sum + num;
        }
        System.out.println(sum);



        // Take integer inputs till the user enters 0 and print the largest number from all.

        System.out.println("Enter a number or press 0 to exit: ");
        int num= in.nextInt();
        int max = num;
        while((num = in.nextInt()) != 0){
          if ( num > max ) {
              max = num;
          }
        }
        System.out.println("Maximum numbere is: "+ max);


    }
}

