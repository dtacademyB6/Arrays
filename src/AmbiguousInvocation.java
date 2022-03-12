public class AmbiguousInvocation {


    public static void main(String... args) {


        OverloadingTheMainMethod.main(new String[]{"cbdcv"});


        System.out.println();


        method(1,3.0);

        method(1.0,3);

      //  method(1,3); // Compiler is letting you know that the call is ambiguous,
                     // and you need to be more specific

      //  method(3.0, 3.0);

    }

    public static void method(int i, double j){
        System.out.println("int double");
    }

    public static void method(double i, int j){
        System.out.println("double int");
    }



}
