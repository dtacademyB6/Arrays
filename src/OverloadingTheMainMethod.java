import java.util.Arrays;

public class OverloadingTheMainMethod {


    public static void main(String[] args) {
        System.out.println("Original main method");

        Arrays.sort(new int[] {});


    }



    // Can you overload the main method?
    // Yes. The main method can be overloaded but only the main method with the correct syntax will run.
    public static void main(String args) {
        System.out.println("my main method");
    }

}
