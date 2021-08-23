import java.util.Scanner;
public class HcfLcm {
    public static void main(String[] args) {
        int num1, num2, max, lcm = 0, hcf = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        num2 = sc.nextInt();

        for(max = 1; max <= num1 || max <= num2; max++) {
            if( num1 % max == 0 && num2 % max == 0 )
                hcf= max;
                lcm = num1 * num2/hcf;

        }
        System.out.println("HCF of given two numbers is :"+hcf);
        System.out.println("LCM of given two numbers is :"+lcm);
    }
}

