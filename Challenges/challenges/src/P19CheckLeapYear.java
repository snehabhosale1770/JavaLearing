import java.util.Scanner;

public class P19CheckLeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Check The Year is Leap Year ");
        System.out.println(" Enter The Year : ");
        int year = input.nextInt();

        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)){
            System.out.println(+ year + " is Leap year");
        }
        else {
            System.out.println(+ year + " is not Leap year");
        }
    }
}
