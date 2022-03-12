public class VarArgs {


    public static void main(String[] args) {

//        method(4,5);
//        method(2,3,4);

//        method(1);  // compiler creates an array {1}
//        method(1,2);
//        method(1,2,3,4,4,5,6,8);
//        method();


        System.out.println(sum(1,5));
        System.out.println(sum(23,45,56,78,12,45,23,2,32,43));
        System.out.println(sum(12,11,12,3));




    }


    public static int sum(int... arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }



        return sum;
    }



//    public static void method(int a, int b){
//
//    }
//
//    public static void method(int a, int b, int c){
//
//    }

    public static void method(int... a){
        System.out.println(a.length);
    }



}
