package OOPS_java;

import OOPS_java.Inheritance.Fish;

/* Bfore HYbrid Inheritance there is a three types of Inheritance 
 1.Single level Inheritance
 2. Multi level Inhertance
 2. Heirachical  Inhertance

 Hybrid is combination of these three INheritance
*/
public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Peacock p1 = new Peacock();
        p1.breathe();
        
    }

    //Base class
    static class Animals {
        String color;

        void eats() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathe");
        }
    }

    //class derived from base class Animals
    static class fish extends Animals{
        int fins;

        void swim() {
            System.out.println("Can Swim");
        }
    }

    //class derived from base class Animals
    static class bird extends Animals{
        int wings;

        void fly() {
            System.out.println("Birds can fly");
        }
    } 

    //class derived from base class Animals
    static class Mammal extends Animals {
        int legs;

        void Run() {
            System.out.println("CAn Run");
        }
    }

    //class derived from base class Fish
    static class shark extends Fish {
        int name;
    }


    //class derived from base class Bird
    static class Peacock extends bird {
        int name;
    }

    //class derived from base class Mammal
    static class Dog extends Mammal {
        int name;
    }



}
