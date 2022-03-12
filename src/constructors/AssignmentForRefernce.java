package constructors;

public class AssignmentForRefernce {


    public static void main(String[] args) {

        int x = 7;
        int y =89;

        y = x;

        System.out.println(x);
        System.out.println(y);


        Dog dog1 = new Dog("Labrador");
        Dog dog2 = new Dog("Shitzu");


        dog1 = dog2; // For objects, the assignment assigns its references (pointers)

        System.out.println(dog1.getBreed());
        System.out.println(dog2.getBreed());





    }
}
