package _24_OOPS;

// class
class Student{
    String name;
    int age;

    // method
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // constructor - non-para
    Student(){
        System.out.println("This is non-parameter consructor!");
    }

    // constructor - para
    // Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    //     System.out.println("This is non-parameter consructor!");
    // }

    // copy constructor - object passing
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class _1_class_Object {
    public static void main(String args[]){
        // object creation - Also non-parameterazid constructor
        // Student s1 = new Student();

        // object creation - parameterazid constructor
        // Student s1 = new Student("A",88);

        Student s1 = new Student();

        // object uses 
        s1.name = "A";
        s1.age = 88;

        // copy constructor 
        Student s2 = new Student(s1);
        
        // call method
        s2.printInfo();
    }
}
