import java.util.Arrays;

public class ArraysClassDemo {


    public static void main(String[] args) {




        int [] arr = {10,9,2,3,8,4,5,7};


        //
        // Arrays are considered reference types

        // Arrays do not have built in methods that you can call on them


        // Arrays Class was added with JDK 1.2 to make working with arrays easier and it contains
        // static methods

        Arrays.sort(arr);

        String arrContent = Arrays.toString(arr);
        System.out.println(arrContent);


        String [] arr2 = {"abracadabra", "Mim", "Abra", "MIM"};

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));


        String [] arr3 = {"abracadabra", "10", "9", "010"};

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));




        int [] arr4 = {10,9,2,3,8,4,5,7};

        Arrays.sort(arr4, 1, 6);

        System.out.println(Arrays.toString(arr4));








    }
}
