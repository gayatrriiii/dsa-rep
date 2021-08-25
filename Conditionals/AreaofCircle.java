import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter value of radius: ");
        float radius = in.nextInt();

        float pi = 3.14f;

        float area = pi * (radius * radius) ;

        System.out.println("The area of the circle is: "+ area);
    }
}
