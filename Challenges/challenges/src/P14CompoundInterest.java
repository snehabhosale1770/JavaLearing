import java.util.Scanner;

public class P14CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Compound Interest Program ");
        System.out.print("Enter Principle : ");
        float principle = input.nextFloat();
        System.out.print("Enter Time : ");
        float time = input.nextFloat();
        System.out.print("Enter Rate : ");
        float rate = input.nextFloat();

        double compoundInterest = principle * Math.pow((1 + rate / 100),time);
        System.out.println("compound Interest is : " +  compoundInterest);
    }


}
