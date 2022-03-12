import java.util.Arrays;

public class ArraysBinarySearch {


    public static void main(String[] args) {




        int [] arr1 = new int[]{2, 3, 4, 5, 7, 8, 9, 10};


        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.binarySearch(arr1, 6 ));



        int[] arr3 = new int[10];

        System.out.println(Arrays.toString(arr3));

//        Arrays.fill(arr3, 99);


        Arrays.fill(arr3, 6, arr3.length, 99);


        System.out.println(Arrays.toString(arr3));
















    }
}
