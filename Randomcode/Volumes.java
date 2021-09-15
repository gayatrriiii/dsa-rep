 import java.util.Scanner;

public class Volumes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Volume of a cone
        System.out.print("Please enter the radius and the height of the cone: ");
        double r = in.nextDouble();
        double h = in.nextDouble();

        double cone =  (22  * r * r * h)/(3 * 7);
        System.out.println("The volume of the cone is: "+ cone + " cubic units");

        // Volume of Prism

        System.out.println("Enter base and height: ");
        int b = in.nextInt();
        int h = in.nextInt();
        int volume = b * h ;
        System.out.println("The volume of the prism is: "+ volume);

        // Volume of cylinder
        System.out.println("Enter radius and height: ");
        float r = in.nextFloat();
        float h = in.nextFloat();
        float volume = ( 22 * r * r * h )/ 7;
        System.out.println("The volume of the cylinder is : "+ volume);


        // Volume of sphere
        System.out.println("Enter radius: ");
        int r = in.nextInt();

        int vol = (22 * 4 * r * r * r) / (7 * 3);
        System.out.println("Volume of the sphere is: "+ vol);

         // Volume of pyramid
        System.out.println("Enter the base length, width and height respectively: ");
        int l = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        int vol = l * w * h / 3;
        System.out.println("The volume of the pyramid: "+ vol);

        // Curved surface area of cylinder
        System.out.println("Enter the radius and height: ");
        int r = in.nextInt();
        int h = in.nextInt();
        int surfacearea = (22*r*(r+h))/7;
        System.out.println("The curved surface area of the cylinder is: "+ surfacearea);

        // Total surface area of a cube (a = length of one side of the cube)
        System.out.print("Enter length: ");
        int a = in.nextInt();
        int tsa = 6 * a * a;
        System.out.println("The total surface area of the cube is: "+ tsa);
    }
}
