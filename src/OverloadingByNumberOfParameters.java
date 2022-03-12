public class OverloadingByNumberOfParameters {


    public static void main(String[] args) {

        printMin();
        printMin(4,3);
        printMin(23, 3424234, 3265645, 1232542);


        //Overloading rules applies only to method signature
        // Name has to be the same, and parameter has to be different (in count, type and order)
        // Access modifier, static keyword, return type is ignored when overloading rule is checked
        // by the compiler
    }





    public static void printMin(int a, int b){

    }

//    public static  int printMin(int a, int b){
//          return 0;
//    }


//    public   void printMin(int a, int b){
//
//    }

//    private static  void printMin(int a, int b){
//
//    }

    public static void printMin(int a, int b, int c){

    }

    public static void printMin(int age, int ssn, int dob, int account){

    }


      public static void printMin(int scasca){

    }


    public static void printMin(){

    }
}
