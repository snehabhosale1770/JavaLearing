import java.util.Scanner;

public class L2UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name :");
        String name = input.nextLine();// string return in nextLine

        System.out.println("Good Morning" +  name);
        System.out.println("Please Enter Your Age");
        int age = input.nextInt();// integer return in nextInt
        System.out.println(name + "sneha's Age is :" + age);
    }
}
