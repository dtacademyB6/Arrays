import java.util.Arrays;

public class TwoDArrayExample {


    public static void main(String[] args) {


        int[] st1Scores = {66,77,88,99,100};

        int[][] allScores  =  { {66,77,88,99,100}, {55,76,79,57,45,90}, {89,77,99,95,99,66}   };



        int [][] arr = new int[2][4];
        int  arr1 [][];
        int [] arr2 [];

        int []  arr4 [], arr5;

//        arr5 = new int[2][3];

        int arr6 [][], arr7;

        arr7 = 8;

        int[] arr8, arr9 [];

        arr9 = new int[7][9];



        int[][] a, b[];

//        b = new int[2][3][6];


        int[][] numColl = new int[4][3];


        System.out.println(Arrays.deepToString(numColl));


//        int[][][] threeD = new int[4][3][2];
//
//        System.out.println(Arrays.deepToString(threeD));

         numColl[1][1] = 25;

        System.out.println(Arrays.deepToString(numColl));

        numColl[3][0] = 99;

        System.out.println(Arrays.deepToString(numColl));


        System.out.println("The length of the outer array is " + numColl.length);

        System.out.println("The length of the second inner array is " + numColl[1].length);


    }
}
