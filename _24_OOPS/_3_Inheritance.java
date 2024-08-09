package _24_OOPS;


// class
class Car{
    String name;
    String model;
    String price;

    public void welcome(){
        System.out.println("Welcome to Car Class");
    }

    public void gretting(){
        System.out.println("Buy Expensive, live Luxurias");
    }
}

class RengeRover extends Car{
    RengeRover(String name, String model, String price){
        super();  //call Superclass 
        // super.gretting(); // call gretting method in superclass 
        this.name = name;
        this.model = model;
        this.price = price;
    }
    public void printInfo(){
        System.out.println("The Car " + name + " and model " + model + ". Price: " + price);
    }
}

class RR_model extends Car{
    // RR_model(String s1, String s2, String s3, String s4){
    //     System.out.print(s1,s2,s3,s4);
    // }
    public void gretting(){
        System.out.println("Hello from new RR model");
        System.out.println(name);
    }
}
public class _3_Inheritance {
    public static void main(String[] args) {
        // RengeRover rr = new RengeRover("Renge Rover", "DYGYE", "2.7Cr");
        // rr.printInfo();

        RR_model m1 = new RR_model();
        m1.gretting();
    }
}
