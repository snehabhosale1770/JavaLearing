import java.util.Scanner;

public class P21AgeGroups {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Categorize a person into different age groups ");
        System.out.println("Please Enter Your Age : ");
        int age = input.nextInt();

        if(age < 13){
            System.out.println(" The person is Child");
        } else if (age < 20) {
            System.out.println("The person is Teenager");
        }
        else if (age < 60) {
            System.out.println("The person is Adult");
        }
        else if (age > 60) {
            System.out.println("The person is Senior");
        }
    }
}
