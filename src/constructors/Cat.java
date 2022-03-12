package constructors;

public class Cat {

//    public Cat(){}   // default constructor is added only if the class has no constructors at all

    public Cat(int s){

    }

    public Cat(){}

    public Cat(int age, int weight){

    }




    public static void main(String[] args) {


        Cat c = new Cat();
        Cat c1 = new Cat(45);
    }
}
