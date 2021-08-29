import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the radius of the circle: ");
        float r = in.nextFloat();
        float pi = 3.14f;
        float area;

        area = pi * (r * r);
        System.out.println("The area of circle is: "+ area);

    }
}
