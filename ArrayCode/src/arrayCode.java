import java.util.Arrays;
import java.util.Scanner;

public class arrayCode {
    public static void main(String[] args) {
        //syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers.....
        //int[] arr = new int[5];

//        String[] arr = new String[4];
//        System.out.println(arr[0]);

        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 62;
        arr[1] = 51;
        arr[2] = 40;
        arr[3] = 22;
        arr[4] = 33;
        //[62, 51, 40, 22, 33] ....
        System.out.println(arr[3]);

        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
 //       }
//        for (int num : arr) { //for every element in array, print the element
//            System.out.println(num + " "); // here num represents elements of the array ....
//       }
//        System.out.println(arr[5]);  // index out of bound error
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Tarique";
        System.out.println(Arrays.toString(str));
    }
}
