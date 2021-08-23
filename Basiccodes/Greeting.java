import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter your name: ");
    String name = in.next();

    System.out.println("Hello there,"+ name+  ". Hope you have an amazing day!");

    }
}
