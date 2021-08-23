import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter amount in rupees: ");
        float rupee = in.nextFloat();

        float dollars;
        dollars = (float) (rupee / 74.3);

        System.out.println("The amount in dollars is: "+dollars);

    }
}
