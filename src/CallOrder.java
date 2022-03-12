public class CallOrder {


    public static void main(String[] args) {

        method1((byte)(2 + 1));

        // byte + byte -> int

        // Type promotion -> anything less than int is promoted to int first then the operation is done


        char ch = 'a';
        char ch1 = 'b';

        System.out.println(ch + ch1);

    }









//    public static void method1(byte b){
//        System.out.println("byte");
//    }

    public static void method1(short b){
        System.out.println("short");
    }
//
    public static void method1(int b){
        System.out.println("int");
    }

    public static void method1(long b){
        System.out.println("long");
    }

//    public static void method1(float b){
//        System.out.println("float");
//    }
//    public static void method1(double b){
//        System.out.println("double");
//    }
}
