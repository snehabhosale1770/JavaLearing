import java.util.Scanner;

public class P20GradeBasedMarks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Grade Based Marks ");
        System.out.println("Please Enter Your Marks : ");
        int marks = input.nextInt();

        if(marks >= 90){
            System.out.println("Student are in distinction");
        } else if (marks >= 75) {
            System.out.println("Student are in Class A");
        }
        else if (marks >= 60) {
            System.out.println("Student are in Class B");
        }
        else if (marks >= 35) {
            System.out.println("Student are in Class C");
        }
        else {
            System.out.println("Student is Fail");
        }
    }
}
