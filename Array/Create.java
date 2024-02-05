// Arrays

// List of elements of the same type placed in contiguous memory location
// Array works on an indexing system start from 0 to (n-1) where n is the size of the array

// Advantage
// •	Arrays store multiple elements of the same type with the same name
// •	You can randomly access elements in the array using an index number
// •	Array memory is predefined, so there is no extra memory loss
// •	2D arrays an efficiently represent the tabular data
// Disadvantage
// •	 The number of elements in the array should be predefined
// •	An array is static it can not alter its size after declaration
// •	Insertion and deletion operations in the array is quite tricky as the array stores elements
//     in continuous form
// •	Allocating excess memory than required may lead to memory wastage
// Operation in array
// •	Create
// •	Input
// •	output
// •	Update

// Create
// datatype arrayName[] =new datatype[size];

import java.util.*;

public class Create {

     //passing arrays as argumrnt to the function---------------------------
     public static void update(int marks[]){
        for(int i=0; i<marks.length;i++)
        // Iterate through each element of the array using a for loop.
        {
             //adding 1 mark in arry
             marks[i] =marks[i]+1;
        }
    }




    public static void main(String[] args) {

        // createing an array----------------------------------------------

        int numbers[] = new int[50];

        int marks[]={10,20,30};

        int moreNumber[] ={4,5,6};

        String fruits[] = {"apple","mango","kela"};
        
    

    // calling update function on array marks-------------------------------
      update(marks);
      
      for(int i=0; i<marks.length;i++){
        System.out.println(marks[i]+" ");
      }
      System.out.println();

    }

}

   

    


