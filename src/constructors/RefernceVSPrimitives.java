package constructors;

public class RefernceVSPrimitives {


    public static void main(String[] args) {


        int x = 67;

        System.out.println(x);

        Cat cat = new Cat();

        System.out.println(cat);


        new Dog().bark(); // anonymous obect is used when you need that object only once

        System.out.println(new String("java").toUpperCase());


        // null  ->

        String str = null;

        System.out.println(str.toLowerCase());






    }
}
