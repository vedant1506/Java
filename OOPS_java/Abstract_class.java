package OOPS_java;

public class Abstract_class {
    public static void main(String[] args) {
       Horse h1 = new Horse();
       Chicken C1 = new Chicken();
       h1.walk();// it has to implement the syso fns because it is defined as abstract fns.
       C1.walk();

       /* Animal a = new Animal() */
        // We cannot define this due to abstact class  

        
        Mustang myhorse = new Mustang();
        //Animal -> Horse -> Mustang. It is saying that first of all animla is called then horse and then Mustang is called as hierachcy.
        

        System.out.println(myhorse.color);//techincally it has to  print blue but it will print brown as default because of it is called in constructor class and it remains defined 

    }
}

abstract class Animal {

    String color;
    Animal() {
        
        System.out.println("animal constructor is called");
        color = "Brown";//used to intialize this as all subclasess
    }
    

    void eat() {
        System.out.println("can eats");
    }

    abstract void walk();// It gives idea that animal can walk so that as per your requirement you have to choose how to use that abstract function

}

class Horse extends Animal {
    int legs;
    

    Horse() {
        System.out.println("horse constructor is called");

    }

    void changeColor() {
        color = "Dark brwon";
    }

    void walk() {//Here the abstract function is used to define that horse is walking with 4 legs.
        System.out.println("walks on 4 legs");
    }
}


class Mustang extends Horse {

    void changeColor() {
        color = "Blue";
    }

    Mustang() {
        System.out.println("Mustang Constructor called");
    }

    void walk() {
        System.out.println("  ");
    }
}

class Chicken extends Animal {
    int legs;

    Chicken(){
        System.out.println("Chicken constructor is called");
    }

    void walk() {//Here the abstract function is used to define that horse is walking with 3 legs.
        System.out.println("walks on 3 legs");
    }
}