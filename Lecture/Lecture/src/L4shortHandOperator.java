import java.util.Scanner;

public class L4shortHandOperator {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        System.out.println(" a is 5 add your value is : ");
        int x1 = input.nextInt();
        a += x1; // insted of using a = a + x1 we used the short hand operator +=
        System.out.println(a);
    }
}
