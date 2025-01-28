import java.util.Scanner;

public class P8SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Swap Two Numbers... ");
        System.out.print("Enter First Number : ");
        int firstNum = input.nextInt();
        System.out.print("Enter Second Number : ");
        int secondNum = input.nextInt();
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("First Number is: "+ firstNum);
        System.out.println("Second Number is: "+ secondNum);
    }
}
