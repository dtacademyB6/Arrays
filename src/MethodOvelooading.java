import java.util.Arrays;

public class MethodOvelooading {


    public static void main(String[] args) {

        System.out.println(max(2,3));

        System.out.println(max(3,4, 56));

        System.out.println(max(new int[] {3,4}, new int[] {3,4,5,6,7,7,8,8,}));


        String str = "cdsvg";

        str.substring(1);
        str.substring(2,3);


        System.out.println();
        System.out.println("vdgsvcdgs");
        System.out.println(12);
        System.out.println(true);
        System.out.println(new int[] {4,5,5});








    }



    public static void doSomething(){  // method signature-> name+parameters

    }

    public static int max(int a, int b){

//        return Math.max(a,b);

        return a>b ? a : b;
    }


    public static int max(int a, int b, int c){

        return Math.max(Math.max(a,b), c);
    }


    public static int max(int[] a, int[] b){

//        return Math.max(a,b);

        return 0;
    }






}
