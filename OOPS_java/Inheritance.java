package OOPS_java;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.breathe();
        shark.swim();
    }

    //Parent class (Base class)
    static class Animals {
        String color;

        void eats() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathe");
        }
    }

    //Child Class (Derived class)
    static class Fish extends Animals{
        int fins;

        void swim() {
            System.out.println("Can Swim");
        }
    }
}
