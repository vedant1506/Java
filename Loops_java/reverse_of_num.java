package Loops_java;

public class reverse_of_num {
    public static void main(String[] args) {
        int num = 10899 ; // Example number to reverse
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append digit to reversedNum
            num = num / 10; // Remove the last digit from num
        }

        System.out.println("Reversed Number: " + reversedNum);
    }
}
