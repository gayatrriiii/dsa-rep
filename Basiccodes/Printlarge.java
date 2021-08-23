import java.util.Scanner;

public class Printlarge {
    public static void main(String[] args) {
        System.out.println("Enter an integer or press 0 to quit: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int max = number;
        while((number = in.nextInt()) != 0){
            if(number > max){
                max = number;
            }
        }
        System.out.println("Larger number is "+ max);

    }
}