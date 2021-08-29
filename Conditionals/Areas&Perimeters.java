import java.util.Scanner;

public class Areas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // (1) Area and perimeter of a circle:

        System.out.print("Enter the radius of the circle: ");
        float r = in.nextFloat();
        float pi = 3.14f;
        float area;

        area = pi * (r * r);
        System.out.println("The area of the circle is: "+ area);
        System.out.println("The perimeter of the circle is: "+ (2 * pi * r));

        // (2) Area of triangle:

        System.out.print("Enter base: ");
        int b = in.nextInt();
        System.out.print("Enter height: ");
        int h = in.nextInt();
        int area;

        area = ( b * h )/ 2;
        System.out.println("The area of triangle is: "+ area);

        // (3) Area of Isosceles triangle:

        System.out.print("Please enter the length of equal side and the base: ");
        float si = in.nextFloat();
        float b = in.nextFloat();
        float area;

        area = (float) ((b/4) * Math.sqrt((4 * si * si) - (b * b)));
        System.out.println("The area of isosceles triangle is: "+ area);


        // (4) Area and perimeter of rectangle:

        System.out.print("Please enter the length and breadth: ");
        float l = in.nextInt();
        float b = in.nextInt();
        float area;

        area = l * b ;
        float perimeter = (2 * ( l + b ));

        System.out.println("The area of rectangle is: "+ area);
        System.out.println("Perimeter of a rectangle is: "+ perimeter);

        // (5) Area and perimeter of parallelogram:

        System.out.print("Enter the length and height: ");
        float b = in.nextFloat();
        float h = in.nextFloat();
        float area , perimeter;

        area = b * h;
        perimeter = (2 * (b+h));
        System.out.println("The area of parallelogram is: "+ area);
        System.out.println("The perimeter of parallelogram is: "+ perimeter);

        // (6)Area and perimeter of a rhombus:

        System.out.print("Enter length of diagonals: ");
        float d1 = in.nextFloat();
        float d2 = in.nextFloat();;
        float area , perimeter;

        area = (d1 * d2)/2;
        perimeter = (float) (2 * Math.sqrt( Math.pow(d1, 2) + Math.pow(d2, 2)));

        System.out.println("The area of rhombus is: "+ area);
        System.out.println("The perimeter of rhombus is "+perimeter);

          // (7) Area and perimeter of an equilateral triangle:

        System.out.print("Please enter length of the side: ");
        float a = in.nextFloat();
        float area , perimeter;

        area = (float) ((1.73 * a * a) /4);
        perimeter = 3 * a;

        System.out.println("The area of the equilateral triangle is: "+ area);
        System.out.println("The perimeter of the equilateral triangle is: "+ perimeter);


        // (8) Perimeter of a square:

        System.out.println("Enter length of one side: ");
        float s = in.nextFloat();
        int perimeter;

        perimeter = (int) (4 * s);
        System.out.println("The perimeter of the square is "+perimeter+ " sq.cms");

    }
}


