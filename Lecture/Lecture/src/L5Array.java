public class L5Array {
    public static void main(String[] args) {

        /*
        int[] myArr = new int[5];
        myArr[0]=98;
        myArr[1]=85;
        myArr[2]=77;
        myArr[3]=69;
        myArr[4]=55;
        */
        int[] myArr = {98,85,77,69,55};
        /*
        int index = 2;

        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[index]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);

         */
        int index = 0;
        while(index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }
        String[] strArr = new String[4];
        strArr[0] = "My First String";

        String[] newStrArr = {"First", "Second", "Third"};
        System.out.println(newStrArr.length);
    }
}
