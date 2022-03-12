import java.util.Arrays;

public class PassByValueObject {



    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,5};

        modifyArray(nums);

        System.out.println(Arrays.toString(nums));

        // Pass by value for mutable objects mean the reference is passed and assigned
        // rather than the object itself


        // Pass by value for immutable objects -> when an immutable object is passed and the method
        // changes the object, the change is NOT reflected in the calling method.

        String str = "Hello";

        modifyString(str);

        System.out.println(str);




    }



    public static void modifyArray(int []  arr){
       Arrays.fill(arr,77);
    }


    public static void modifyString(String name){
        name = name.toUpperCase();
        System.out.println("Inside method: " + name);
    }
}
