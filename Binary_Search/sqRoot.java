package Binary_Search;

import java.util.Scanner;

public class sqRoot {
    static int squareRoot(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number");
        }
        
        int start = 0;
        int end = n;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid; // Use long to prevent overflow

            if (square == n) {
                return mid; // Found the exact square root
            } 
            else if (square < n) {
                result = mid; // Update result to the last valid mid
                start = mid + 1; // Search in the right half
            } 
            else {
                end = mid - 1; // Search in the left half
            }
        }
        return result; // Return the floor value of the square root
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1==1){
            System.out.print("Enter a number to find its square root: ");
            int n = sc.nextInt(); 
    
            int result = squareRoot(n);
            System.out.println("The square root of " + n + " is: " + result);
            System.out.println();
        }
    }
}
