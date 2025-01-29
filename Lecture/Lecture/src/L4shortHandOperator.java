import java.util.Scanner;

public class L4shortHandOperator {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        System.out.println(" a is 5 add your value is : ");
        int x1 = input.nextInt();
        a += x1; // insted of using a = a + x1 we used the shorthand operator +=
        System.out.println(a);

        System.out.println(" a is 5 subtract your value is : ");
        int x2 = input.nextInt();
        a -= x2; // insted of using a = a - x2 we used the shorthand operator -=
        System.out.println(a);

        System.out.println(" a is 5 Multiply your value is : ");
        int x3 = input.nextInt();
        a *= x3; // insted of using a = a * x3 we used the shorthand operator *=
        System.out.println(a);

        System.out.println(" a is 5 divide your value is : ");
        int x4 = input.nextInt();
        a /= x4; // insted of using a = a + x4 we used the shorthand operator /=
        System.out.println(a);

        System.out.println(" a is 5 moldule your value is : ");
        int x5 = input.nextInt();
        a %= x1; // insted of using a = a % x1 we used the shorthand operator %=
        System.out.println(a);
    }
}
