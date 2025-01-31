import java.util.Scanner;

public class P28BitwiseEvenOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Check The Even Odd Number Using Bitwise Operators");
        System.out.print("Enter The Number ");
        int num = input.nextInt();

        if((num | 1) > num){
            System.out.println(num +" Is Even Number");
        }
        else{
            System.out.println(num +" Is Odd Number");
        }
    }
}
