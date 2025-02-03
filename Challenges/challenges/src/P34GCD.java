import java.util.Scanner;

public class P34GCD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Program of GCD");
        System.out.print("Enter First Number ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number ");
        int num2 = input.nextInt();

        int gcd = findGCD(num1,num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
    public static int findGCD(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
