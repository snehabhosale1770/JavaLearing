import java.util.Scanner;

public class P31Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("factorial Program ");
        System.out.print("Enter The Number : ");
        int num = input.nextInt();

        int factorial = 1;
        int i = num;
        while(i > 0){
            factorial *= i;
            i--;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
