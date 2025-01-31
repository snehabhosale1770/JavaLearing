import java.util.Scanner;

public class P22BitwiseAND {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Program of Bitwise AND");
        System.out.print("Enter First Number ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number ");
        int num2 = input.nextInt();

        System.out.println((num1 & num2));
    }
}
