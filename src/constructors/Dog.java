package constructors;

public class Dog {

    int age;
    String breed;
    double weight;


    public static void main(String[] args) {
//        bark();

        Dog d = new Dog();

        Cat c = new Cat();

        Dog d2 = new Dog(10);
        Dog d3 = new Dog("Shiba Inu");
        Dog d4 = new Dog(5, "Husky", 10);

        Dog d5 = new Dog(26, 63455632);


    }

    public Dog(){
        age = 5;
        breed ="Lab";
        weight = 60;
    }


    public Dog(int newAge){
        age = newAge;

    }

    public Dog(int newAge, int id){
        age = newAge;


    }

    public Dog(String newBreed){
        breed = newBreed;
    }

    public String getBreed(){
        return breed;
    }

    public Dog(int newAge, String newBreed, double newWeight){
        breed = newBreed;
        age = newAge;
        weight = newWeight;

    }















//    public Dog(){
//        System.out.println("Dog Constructor is called");
//    }

//    public void Dog(){
//        System.out.println("Dog method is called");
//    }

    // Constructors differ from methods in 3 ways:
    // - no return type
    // - must have the same as the class
    // - they are called implicitly
    // - the purpose of a constructor is to initialize the object, the method can be for anything


    public  void bark(){
        System.out.println("Woof");
    }



}
