import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Ways to declare array variable

        //int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        //or

        int[] myIntArray = new int[25];

        //use length; myIntArray.length
        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
        }

        for(int i=0; i<myIntArray.length; i++){
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }

        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[8]);

    }
}