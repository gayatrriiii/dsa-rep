import java.util.Scanner;

public class Maxof3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 3 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;

        //method 1:
//        if(b > max){
//            max = b;
//            System.out.println("The maximum value is: "+ b);
//        } else if (c > max){
//            max = c;
//            System.out.println("The maximum value is: "+c);
//        } else System.out.println("The maximum value is: "+a);

        // method 2 (more optimised)

//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//        System.out.println(max);


        // method 3 (most optimized)

        int max = Math.max(c, Math.max(a, b));
        System.out.println("Maximum value is: "+ max);

    }
}


