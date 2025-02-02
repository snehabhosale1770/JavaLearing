import java.util.Scanner;

public class L5ReturnType {
    public static void main(String[] args) {

        addition();
        int num1 = takeNumber();
        int num2 = takeNumber();

        int sum = num1 + num2;
        System.out.println("Sum Of The Number is : " + sum);
    }

    public static int takeNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number Number : ");
        int number = input.nextInt();
        return number;
    }

    public static void addition() {
        System.out.println("Addition Of Two Numbers");
    }
}
