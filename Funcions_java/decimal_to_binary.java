package Funcions_java;

public class decimal_to_binary {
    public static void decToBin(int n) {
       
       int pow = 0;
       int binNum = 0;


        while(n > 0) {
            int remainder = n % 2;
            binNum = binNum + remainder * (int)Math.pow(10, pow);
            n = n / 2;
            pow++;
        }

        System.out.println("Binary Number: " + binNum);
    }

    public static void main(String[] args) {
        decToBin(6); // Example decimal number
    }
}
