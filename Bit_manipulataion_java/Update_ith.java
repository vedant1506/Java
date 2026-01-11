package Bit_manipulataion_java;

public class Update_ith {
    public static int updateIthBit(int n , int i , int newBit) {
        //clear ith bit
        if (newBit == 0) { 
        int bitMask = ~(1<<i);
        n = n & bitMask;
        } else {
        //set ith bit
        int newBitMask = newBit << i;
        n = n | newBitMask;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
