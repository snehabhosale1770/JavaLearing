public class L3TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5; /* 5 is a integer but compiler automatically convert that small number but ;
                             not for the large number */
        System.out.println(myFloat);

        int myInt = (int) 5.88; // here we convert the float num to integer num using type casting
        System.out.println(myInt);

    }
}
