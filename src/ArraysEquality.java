import java.util.Arrays;

public class ArraysEquality {


    public static void main(String[] args) {




        int [] arr1 = new int[]{10,9,2,3,8,4,5,7};

        int [] arr2 = new int[]{10,9,2,3,8,4,5,7};


        System.out.println(arr1 == arr2); // compares memory addresses of the objects


        System.out.println(arr1.equals(arr2)); // compares the memory location, equivalent to ===


        // To compare 2 arrays, use Arrays class's equals() method
        System.out.println(Arrays.equals(arr1, arr2)); // compares the content equality











    }
}
