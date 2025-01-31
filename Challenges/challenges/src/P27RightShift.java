import java.util.Scanner;

public class P27RightShift {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Program of Bitwise Right Shift");
        System.out.print("Enter First Number ");
        int num = input.nextInt();

        System.out.println((num >> 1));
    }
}

