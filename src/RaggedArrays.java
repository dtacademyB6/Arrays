import java.util.Arrays;

public class RaggedArrays {


    public static void main(String[] args) {

          int[][] arr = {
                  {1,2,3,4,5},
                  {1,2,3,4},
                  {1,2,3},
                  {1,2},
                  {1},
                  {}

          };

        System.out.println(arr.length);
        System.out.println(arr[4].length);
        System.out.println(arr[5].length);

        System.out.println(arr[3][1]);


        int [][] arr2 = new int[4][];

        System.out.println(Arrays.deepToString(arr2));

//        arr2[0] =  new int[]{};
        arr2[1] =  new int[]{2,2,2};
        arr2[2] =  new int[]{4,4,4,4,4};
        arr2[3] =  new int[]{2,12,3,4,5,6,67};

//
        System.out.println(Arrays.deepToString(arr2));


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }


//        arr2 = new int[5][2];
//
//        System.out.println(Arrays.deepToString(arr2));
//
//
//
//
//        arr2[2] = new int[] {1,2};
//
//        System.out.println(arr2[2][1]);













    }
}
