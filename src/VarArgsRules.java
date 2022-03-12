import java.util.Arrays;

public class VarArgsRules {


    public static void main(String[] args) {

//        method(4,5);
//        method(2,3,4);

//        method(1);  // compiler creates an array {1}
//        method(1,2);
//        method(1,2,3,4,4,5,6,8);
//        method();


        method("1", "2", "3", "4", "5");


        method2(1,2,3,4,5);
        method2(new int[] {1,1,1,1}); // you can also pass an array to varargs parameter


//        method3(1,2,3,4,5);
        method3(new int[] {1,1,1,1});

    }

    public static void method(String str, String str2, String... arr){ //only one varargs parameter is allowed
        System.out.println(str);
        System.out.println(str2);
        System.out.println(Arrays.toString(arr));
    }

    public static void method2(int... arr){ //only one varargs parameter is allowed
        System.out.println(Arrays.toString(arr));
    }

    public static void method3(int[] arr){ //only one varargs parameter is allowed
        System.out.println(Arrays.toString(arr));
    }

//    public static void method3(int... arr){ //cannot overload [] with ...
//        System.out.println(Arrays.toString(arr));
//    }







//    public static void method(int... a){
//        System.out.println(a.length);
//    }

//    public static void method(int... a, String... arr){ //only one varargs parameter is allowed
//                                                        // that varargs parameter has to be the last parameter
//        System.out.println(a.length);
//    }





}
