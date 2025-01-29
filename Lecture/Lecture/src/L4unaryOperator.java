public class L4unaryOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(z);

        int a = 5;
        a += 1;
        System.out.println(a);
        a++; // postIncrement of a
        System.out.println(a);
        ++a; // preIncrement of a
        System.out.println(a);
        a--; // postDecrement of a
        System.out.println(a);
        --a; // preDecrement of a
        System.out.println(a);
    }
}
