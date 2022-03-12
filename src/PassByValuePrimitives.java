public class PassByValuePrimitives {


    public static void main(String[] args) {

        int y = 9;

        multiplyBy10(y);

        System.out.println("The value of y in the main method: " + y);

        // Pass by value for primitives mean, the copy(value) of the primitive variable is passed
        // rather than the original variable itself


        increment(y);

        System.out.println("The value of y in the main method: " + y);


        int num = 45;

        num = decrement(num);

        System.out.println(num);



    }




    public static void multiplyBy10(int y){

        y = y * 10;
        System.out.println("The value of y inside the method: " + y);
    }

    public static void increment(int y){

        y++;
        System.out.println("The value of y inside the method: " + y);
    }


    public static int decrement(int y){

        y--;
        return y;
    }



}
