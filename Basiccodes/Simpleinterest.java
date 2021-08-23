import java.util.Scanner;

public class Simpleinterest {

    public static void main(String[] args) {
    Scanner inputs = new Scanner(System.in);

    System.out.print("Please enter the principal: ");
    float p = inputs.nextFloat();

    System.out.print("Please enter the interest rate: ");
    float r = inputs.nextFloat();

    System.out.print("Please enter the time duration: ");
    float t = inputs.nextFloat();

    float SI;

    SI = (p * r * t)/100;

    System.out.println("The simple interest is :"+ SI);

    }
}
