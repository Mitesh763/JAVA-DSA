package _24_OOPS;


abstract  class  Animal{
    abstract  void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("4 legs");
    }
}

class Cow extends Animal{
    public void walk(){
        System.out.println(" also 4 legs");
    }
}
public class _5_Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}
