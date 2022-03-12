import java.util.Arrays;

public class NestedForEachLoop {


    public static void main(String[] args) {


        int[][] arr = {{1,2,3,4,5,6}, {2,3}, {4,4,4,4}};


        for( int[] innerArr : arr ){
            for( int num : innerArr){
                System.out.print(num + " ");
            }
            System.out.println();
        }



        int[][][] arr2 = {  { {1,2},{1,1} },    {{1,1},{2,2,},{3,3}}, {{6,6}} };


        for( int[][] a :arr2){
            for( int[] b :a){
                for (int c: b){
                    System.out.print(c + " ");
                }
            }
        }

    }
}
