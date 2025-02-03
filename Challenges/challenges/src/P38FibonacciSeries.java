import java.util.Scanner;

public class P38FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series Program ");
        int num = gettingNumber();
        System.out.println("The Fibonacci sequence is : ");
        fibonacci(num);
    }
    public static int gettingNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter the Number where you want to go : ");
        int num = input.nextInt();
        return num;
    }
    public static void fibonacci(int num){
        int n1 = 0;
        int n2 = 1;
        int i = 0;
        int n3 = 0;
        if(num == 0){
            System.out.println("Number is Not a valid Number");
        } else if (num == 1) {
            System.out.println(n1);
        }
        else{
            while(i<num){
                System.out.println(n1);
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                i++;
            }
        }
    }
}
