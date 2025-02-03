import java.util.Scanner;

public class P37PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Check Whether the Number is Prime or Not ");
        System.out.print("Enter The Number : ");
        int num = input.nextInt();
        if(prime(num)){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
    public static boolean prime(int num){
        int i = 2;
        boolean flag = false;
        while(i < num){
            if(num%i!=0){
                flag = true;
            }
            i++;
        }
        return flag;
    }
}
