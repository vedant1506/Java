package OOPS_java;

public class Creating_Object {
    public static void main(String[] args) {
        Pen P1 = new Pen();//this is will create new object named as P1
        P1.setcolor("blue");
        P1.settip(2);
        System.out.println(P1.color);
        System.out.println(P1.tip);
        
    }
}

class Pen {
    String color;
    int tip;

    void setcolor(String newColor) {
        color = newColor;
    }

    void settip(int newTip) {
        tip = newTip;
    }
}
