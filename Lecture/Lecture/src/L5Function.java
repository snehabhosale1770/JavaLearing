public class L5Function {
    public static void main(String[] args) {
        System.out.println("In Main Method");
        greetUser();
        System.out.println("Method Calling Complete");

        rightHalfPattern();
        reverseRightHalfPattern();
        lightHalfPattern();
    }

    public static void greetUser() {
        System.out.println("Good Morning From KG Coding");
    }

    public static void rightHalfPattern() {
        System.out.println("Right Half Pattern");
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
    }

    public static void reverseRightHalfPattern() {
        System.out.println(" Reverse Right Half Pattern");
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("* ");
    }

    public static void lightHalfPattern() {
        System.out.println("Left Half Pattern");
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}
