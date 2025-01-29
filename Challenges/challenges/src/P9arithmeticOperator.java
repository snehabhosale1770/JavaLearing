import java.util.Scanner;

public class P9arithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("All Arithmetic Operators Program ");
        System.out.println("Enter First Number : ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = input.nextInt();

        int add = num1 + num2;
        System.out.println("The Addition Of " + num1 + " + " + num2 + " is : " + add);

        int sub = num1 - num2;
        System.out.println("The Subtraction Of " + num1 + " - " + num2 + " is : " + sub);

        int mul = num1 * num2;
        System.out.println("The Multiplication Of " + num1 + " * " + num2 + " is : " + mul);

        int div = num1 / num2;
        System.out.println("The Division Of " + num1 + " / " + num2 + " is : " + div);

        int module = num1 % num2;
        System.out.println("The Modulus Of " + num1 + " % " + num2 + " is : " + module);
    }
}
