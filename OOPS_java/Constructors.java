package OOPS_java;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Harry";
        s1.roll = 101;
        // Student s2 = new Student("Rohan", 102);
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll); 
    }
    
}

class Student {
    String name;
    int roll;

    //Non Parameterized Constructors
     Student() {
         System.out.println("Constructor is called..");        
     }


    // //Parameterized Constructors
    // Student(String name, int roll) {
    //     this.name = name;
    //     this.roll = roll;
    // }

    //Copy Constructors
    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
    }


 }
