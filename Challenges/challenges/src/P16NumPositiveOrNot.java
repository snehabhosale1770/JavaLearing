import java.util.Scanner;

public class P16NumPositiveOrNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number : ");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is Zero");
        }
    }
}
