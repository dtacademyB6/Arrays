import java.util.Arrays;

public class ArrayOperations2 {


    public static void main(String[] args) {


         // Initialize each element with random number between 1-10
        int[][] arr = new int[10][5];

         //Get the sum of all elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = 1+ (int)(Math.random()*10);
                sum+=arr[i][j];
            }


        }


        System.out.println(Arrays.deepToString(arr));

        System.out.println("The sum is " + sum);




    }
}
