import java.util.Scanner;

public class P6UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        String Name = input.nextLine();
        System.out.println("Welcome" + Name + "to KG Coding");
    }
}
