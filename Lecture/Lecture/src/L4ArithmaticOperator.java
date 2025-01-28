import java.util.Scanner;

public class L4ArithmaticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = input.nextInt();
        System.out.println("Enter second Number : ");
        int b = input.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
