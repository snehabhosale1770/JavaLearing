import java.util.Scanner;

public class P10ProductOfFloatingNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Product Of Two Floating Point Numbers : ");
        System.out.println("Enter First Number : ");
        float num1 = input.nextFloat();
        System.out.println("Enter Second Number : ");
        float num2 = input.nextFloat();

        float product = num1 * num2;
        System.out.println("The Product Of " + num1 + " and " + num2 + " is : " + product);
    }
}
