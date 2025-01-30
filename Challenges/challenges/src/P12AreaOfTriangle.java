import java.util.Scanner;

public class P12AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area Of Triangle Program ");
        System.out.print("Enter Breadth : ");
        float breadth = input.nextFloat();
        System.out.print("Enter Height : ");
        float height = input.nextFloat();

        double area = 0.5 * breadth * height;
        System.out.println("Area Of Triangle is : " + area);
    }
}
