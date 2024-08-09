package _24_OOPS;

// class
class Student{
    // String name;
    // int age;

    /**
     * method overloading
     * in this, in single class many method are there with same name
     * but different parameter and diffrent datatypes
     */
    public void printInfo(String name){
        System.out.println(name);
    }
    
    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
}

public class _2_Polymorphism {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.printInfo("mitesh");
        s1.printInfo(12);
    }
}
