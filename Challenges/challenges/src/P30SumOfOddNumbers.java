import java.util.Scanner;

public class P30SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Check Sum Sum Of All Odd Numbers ");
        System.out.println("Please Enter The Number : ");
        int num = input.nextInt();

        int sum = 0;
        int i = 1;
        while(i <= num){
            sum += i;
            i += 2;
        }
        System.out.println("Sum of odd numbers from 1 to " + num + " is: " + sum);
    }
}
