import java.util.Scanner;

public class P33LCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Program of LCM");
        System.out.print("Enter First Number ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number ");
        int num2 = input.nextInt();

        int max = Math.max(num1,num2);
        int lcm = max;
        while(true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                break;
            }
            lcm++;
        }
        System.out.println("Least Common Multiply (LCM) of " + num1 + " and " + num2 + " is " + lcm);
    }
}
