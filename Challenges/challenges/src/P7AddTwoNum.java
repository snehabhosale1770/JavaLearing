import java.util.Scanner;

public class P7AddTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Numbers :");
        int num1 = input.nextInt();
        System.out.print("Enter Second Numbers :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Addition is :" + sum);


    }
}
