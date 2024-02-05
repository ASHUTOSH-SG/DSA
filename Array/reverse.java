import java.util.*;


public class reverse {

    // This method reverses an array of integers in-place.
    public static void reverse(int number[]) {
        // Initialize two pointers, 'first' pointing to the start of the array and 'last' pointing to the end.
        int first = 0, last = number.length - 1;

        // Continue swapping elements at 'first' and 'last' positions until the pointers meet in the middle.
        while (first < last) {
            // Swap the elements at the 'first' and 'last' positions.
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            // Move the pointers towards each other.
            first++;
            last--;
        }
    }

    
    public static void main(String[] args) {
        // Create an array of integers named 'number'.
        int number[] = {2, 4, 6, 8, 10};

        // Call the 'reverse' method to reverse the array.
        reverse(number);

        // Print the reversed array.
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println(); // Print a newline for better formatting.
    }
}
