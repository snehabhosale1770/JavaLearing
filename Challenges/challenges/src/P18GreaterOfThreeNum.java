import java.util.Scanner;

public class P18GreaterOfThreeNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Check The Greater than Three Numbers ");
        System.out.print("Enter First Number : ");
        int first = input.nextInt();
        System.out.print("Enter second Number : ");
        int second = input.nextInt();
        System.out.print("Enter Third Number : ");
        int third = input.nextInt();

        if(first > second && first > third){
            System.out.println(+ first +" is Greater Number");
        } else if (second > first && second > third) {
            System.out.println(+ second + " is Greater Number");
        }
        else {
            System.out.println(+ third +" is Greater Number");
        }
    }
}
