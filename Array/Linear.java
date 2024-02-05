// This is a Java program that performs a linear search on an array.

public class Linear {

    // The method linearSearch takes an array of integers (numbers) and an integer key as parameters.
    public static int linearSearch(int numbers[], int key) {

        // Iterate through each element of the array using a for loop.
        for (int i = 0; i < numbers.length; i++) {

            // Check if the current element is equal to the key we are searching for.
            if (numbers[i] == key) {

                // If found, return the index of the key in the array.
                return i;
            }
        }

        // If the key is not found in the array, return -1.
        return -1;
    }

    // The main method, where the program starts its execution.
    public static void main(String[] args) {

        // Create an array of integers named "numbers".
        int numbers[] = {2, 3, 4, 6, 7, 10, 29};

        // Specify the key (number) that we want to search for in the array.
        int key = 10;

        // Call the linearSearch method and store the result in the variable "index".
        int index = linearSearch(numbers, key);

        // Check if the index is -1, which means the key was not found.
        if (index == -1) {
            System.out.println("Key not found in the array.");
        } else {
            // If the index is not -1, print the index where the key was found.
            System.out.println("Key is at index " + index);
        }
    }
}
