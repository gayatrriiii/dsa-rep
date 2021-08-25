import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the base: ");
        int b = in.nextInt();
        System.out.print("Please enter the height: ");
        int h = in.nextInt();

        int area = (int) (0.5 * b * h);

        System.out.println("The area of the triangle is "+ area+ " sq.cms");
    }
}
