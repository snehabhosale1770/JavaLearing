public class L5Parameter {
    public static void main(String[] args) {
//       int num = sum(4,6); // arguments
//        System.out.println(num);
        System.out.println(sum(4,5));
        System.out.println(sum(10,20));
        System.out.println(sum(22,33));
    }

    public static int sum(int first, int second){// parameter
        System.out.println("First Number is Received " + first);
        System.out.println("Second Number is Received " + second);
        System.out.print("Addition is : ");
        return first + second;
    }
}
