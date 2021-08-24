import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int salary = input.nextInt() ;


        if(salary > 20000) {
            salary += 3000;
        }else if(salary > 10000) {
            salary += 2000;
        } else salary += 1000;

        System.out.println("The total salary is: "+ salary);
    }
}
