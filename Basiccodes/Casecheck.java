import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an alphabet: ");
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("The letter is lowercase!");
        } else System.out.println("The letter is uppercase!");
    }
}
