import java.util.Scanner;

public class P25BitwiseCompliment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Program of Bitwise Compliment(~)");
        System.out.print("Enter The Number ");
        int num = input.nextInt();

        System.out.println((~num));
    }
}
