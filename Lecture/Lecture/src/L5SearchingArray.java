import java.util.Scanner;

public class L5SearchingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = {3,6,9,88,65,78,99,43,32,76,55,33,22,11};
        System.out.println("Welcome To Array Searching ");
        System.out.print("Enter The Number you want to search : ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("Your Number Was Found in the Array");
        }
        else{
            System.out.println("Your Number Was Not Found in the Array");
        }
    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
