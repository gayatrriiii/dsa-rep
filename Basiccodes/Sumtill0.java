import java.util.Scanner;

public class Sumtill0 {
    public static void main(String[] args) {
        System.out.println("Enter an integer or press 0 to quit: ");
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;

        while((num = in.nextInt()) != 0){
            sum = sum + num;
        }
        System.out.println("The sum is "+ sum);

    }
}