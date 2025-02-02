import java.util.Scanner;

public class P29MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Print the Given number Multiplication Table ");
        System.out.print("Please Enter the Number : ");
        int num = input.nextInt();
        System.out.println("Multiplication Table for " + num + " :");

        int i = 1;
        while(i <= 10){
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
