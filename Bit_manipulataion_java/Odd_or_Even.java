package Bit_manipulataion_java;

public class Odd_or_Even {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            //even number
            System.out.println("Even Number");
        }
        else {
            //odd number
            System.out.println("Odd NUmber");
        }
    }

    public static void main(String[] args) {
        oddOrEven(2);
        oddOrEven(11);

    }
}
