import java.util.Scanner;

public class P15FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Convert Fahrenheit to Celsius");
        System.out.println("Enter the Fahrenheit : ");
        float fahrenheit = input.nextFloat();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Converting Fahrenheit to Celsius is : " + celsius);
    }
}
