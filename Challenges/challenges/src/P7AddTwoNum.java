import java.util.Scanner;

public class P7AddTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Numbers : ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Numbers : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is : " + sum);

        int sub = num1 - num2;
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is : " + sub);

        int mul = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + mul);

        int div = num1 / num2;
        System.out.println("Division of " + num1 + " and " + num2 + " is : " + div);
    }
}
