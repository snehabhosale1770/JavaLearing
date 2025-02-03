import java.util.Scanner;

public class P36Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Check The String Is Palindrome Or Not ");
        System.out.print("Please Enter The String : ");
        String str = input.next();

        String temp = "";
        int i = 0;
        while(i < str.length()){
            temp += str.charAt(str.length()-1-i);
            i++;
        }
        if(str.equals(temp)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
