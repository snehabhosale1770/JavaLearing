import java.util.Scanner;

public class P17NumOddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Check the Number is Even or Odd ");
        System.out.print("Enter The Number : ");
        int num1 = input.nextInt();

        if(num1 % 2 == 0){
            System.out.println(+ num1 +" is the Even Number");
        }
        else{
            System.out.println(+ num1 +" is Odd Number");
        }
    }
}
