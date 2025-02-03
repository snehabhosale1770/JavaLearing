import java.util.Scanner;

public class P35reverseDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Reverse digits Program ");
        System.out.print("Enter The Number : ");
        int num = input.nextInt();

        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
