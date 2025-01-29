import java.util.Scanner;

public class P11PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perimeter Of Rectangle Program ");
        System.out.print("Enter First Number : ");
        int A = input.nextInt();
        System.out.print("Enter Second Number : ");
        int B = input.nextInt();
        System.out.print("Enter Third Number : ");
        int C = input.nextInt();
        System.out.print("Enter Fourth Number : ");
        int D = input.nextInt();

        int ABCD = A+B+C+D;
        System.out.println("Perimeter Of Rectangle is : " + ABCD);
    }
}
