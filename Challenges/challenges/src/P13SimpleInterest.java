import java.util.Scanner;

public class P13SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Interest Program ");
        System.out.print("Enter Principle : ");
        int P = input.nextInt();
        System.out.print("Enter Time : ");
        int T = input.nextInt();
        System.out.print("Enter Rate : ");
        int R = input.nextInt();

        int simpleInterest = (P*T*R)/100;
        System.out.println("Simple Interest is : " + simpleInterest);
    }
}
