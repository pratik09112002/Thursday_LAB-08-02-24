/*Q2. Write a method that takes a String[] as an argument and 
returns a String containing the concatenation of all the strings in the input array. 
Invoke your method 3 times with different arguments. Make sure that your code 
handles the cases where the argument is null.*/


package LAB9_08_01_24;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of strings in the array
        System.out.print("Enter the number of strings in the array: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create an array to store the strings
        String[] array = new String[numStrings];

        // Prompt user to enter each string
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        // Invoke the method and print the result
        System.out.println("Concatenated String: " + concatenateStrings(array));
        
        scanner.close();
    }

    public static String concatenateStrings(String[] array) {
        if (array == null) {
            return ""; // Return empty string if the input array is null
        }
        
        StringBuilder result = new StringBuilder();
        for (String str : array) {
            result.append(str);
        }
        return result.toString();
    }
}


