import java.util.*;


public class Largest {

    // This method takes an array of integers (numbers) and returns the largest value in the array.
    public static int getLargest(int numbers[]) {
        
        // Initialize a variable "largestt" to the minimum possible integer value (negative infinity).
        int largestt = Integer.MIN_VALUE; // - infinity

        // Iterate through each element of the array using a for loop.
        for (int i = 0; i < numbers.length; i++) {
            
            // Check if the current element is greater than the current largest value.
            if (largestt < numbers[i]) {
                
                // If true, update the largest value with the current element.
                largestt = numbers[i];
            }
        }

        // Return the largest value found in the array.
        return largestt;
    }

    // The main method, where the program starts its execution.
    public static void main(String[] args) {
        
        // Create an array of integers named "numbers".
        int numbers[] = {1, 2, 3, 4, 5, 6, 7};
        
        // Call the getLargest method and print the result.
        System.out.println("The largest value is " + getLargest(numbers));
    }
}
