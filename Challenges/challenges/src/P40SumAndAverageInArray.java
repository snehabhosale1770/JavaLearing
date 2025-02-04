import java.util.Scanner;

public class P40SumAndAverageInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sum and Average of all elements in an array");
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i++;
        }
        double average = (double) sum / arr.length;
        System.out.println("Sum is : " + sum);
        System.out.println("Average is : "+ average);
    }
}
