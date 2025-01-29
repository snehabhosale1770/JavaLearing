public class L4orderOfOperation {
    public static void main(String[] args) {
        System.out.println("Using BODMAS Rule (),/,*,+.-");
        System.out.println(8-3*3); // 1st solve the multiplication then subtraction
        System.out.println(9/3/3); // if operator is same then goes left to right 9/3 then 3/3
        System.out.println(9/(3/3+2)); // here 1st solve the brackets in that bracket 1st solve divide then addition
    }
}
