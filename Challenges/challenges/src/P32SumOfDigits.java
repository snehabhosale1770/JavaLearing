import java.util.Scanner;

public class P32SumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("factorial Program ");
        System.out.print("Enter The Number : ");
        int num = input.nextInt();

        int sum = 0;
        int temp = Math.abs(num);
        while(temp > 0){
            sum += temp % 10;
            temp /= 10;
            System.out.println("Sum Of Digits : " + sum);
        }
    }
}
