public class OverloadingByOrderOfParameters {


    public static void main(String[] args) {

        concatenate("Xsvgs", true, 32);
        concatenate(false, 121, "ncbsvda");
        concatenate(23, true, "cbdsf");
    }





    public static void concatenate(String str, boolean b, int i){

    }


    public static void concatenate(boolean b, int i, String str){

    }


    public static void concatenate(int i, boolean b, String str){

    }
    public static void concatenate(int i, boolean b){

    }

    public static void concatenate(int i, char b){

    }





}
