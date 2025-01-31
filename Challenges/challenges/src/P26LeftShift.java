import java.util.Scanner;

public class P26LeftShift {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Program of Bitwise Left Shift");
        System.out.print("Enter First Number ");
        int num = input.nextInt();

        System.out.println((num << 1));
    }
}
