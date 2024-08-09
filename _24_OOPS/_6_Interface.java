package _24_OOPS;

interface Animal{
    // constant
    // Double PI = 3.14;

    // 
    public void makeSound();

    // default method
    // default void eat(){
    //     System.out.println("Animal eatting!");
    // }

    // static method
    // static void sleep(){
    //     System.out.println("Animal now sleeping");
    // }
}

// interface Birds{
//     void play();
// }


class Dog implements Animal{  // multiple in heritance
    // @Override
    public void makeSound(){
        System.out.println("Bhow Bhow!!");
    }
    // @Override
    // public void eat(){
    //     System.out.println("Dog eat Roti");
    // }
}

public class _6_Interface {
    public static void main(String[] args) {
        Animal myPet1 = new Dog();
        myPet1.makeSound();
        // myPet1.eat();
        // Animal.sleep();
    }
}
