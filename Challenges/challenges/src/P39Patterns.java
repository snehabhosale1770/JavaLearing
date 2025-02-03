public class P39Patterns {
    public static void main(String[] args) {
        //rightHalfPattern();
        reverseHalfPattern();
    }
    /*
    public static void rightHalfPattern() {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

*/
        public static void reverseHalfPattern () {
            int rows = 5;
            while (rows >= 0) {
                System.out.print("*");
                int i = 1;
                while (i <= rows) {
                    System.out.print(" *");
                    i++;
                }
                System.out.println();
                rows--;
            }



        }
    }
