// Name: Shubh Agarwal
// PRN: 2207126108
// Batch: AIML B2 

import java.util.*;

public class Neighbours {
    public static void main(String[] args) {
        // Create an instance of UserInput
        UserInput userInput = new UserInput();
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array ");
        size = sc.nextInt();

        // Now doing the proper calculation passing the size parameter
        int[] inputarray = userInput.inputNumbers(size);
        int mindistance = Integer.MAX_VALUE; // maximum value will be saved
        int indexofmindistance = -1;

        for (int i = 0; i < size - 1; i++) {
            int currentdistance = Math.abs(inputarray[i] - inputarray[i + 1]);
            if (currentdistance < mindistance) {
                mindistance = currentdistance;
                indexofmindistance = i;
            }
        }
        System.out.println("Index of the first number with the smallest distance: " + indexofmindistance);
        System.out.println("Numbers: " + inputarray[indexofmindistance] + " and " + inputarray[indexofmindistance + 1]);
    }
}
