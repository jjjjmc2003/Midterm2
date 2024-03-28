package MidTerm.Q1;
import  java.util.Arrays;

/**
 * Do This first
 */

public class ArrayDuplicator {


    public static int[] duplicateArray(int[] originalArray) {

       //TODO: Return a new array that duplicates the values in the originalArray
        int [] duplicatedArray = Arrays.copyOf(originalArray, originalArray.length*2);


        //TODO comment out the following and return your array
        return duplicatedArray;
    }

    public static void main(String[] args) {
        // Optional: Write some test cases to demonstrate the functionality of your method
        int[] original = {1, 2, 3};
        int[] duplicated = duplicateArray(original);
        // Printing the duplicated array to demonstrate functionality
        for (int num : duplicated) {
            System.out.print(num + " ");
        }
    }
}
