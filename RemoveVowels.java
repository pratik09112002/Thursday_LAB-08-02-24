/*Q5. Write a program in Java to accept a word/a String and 
display the new string after removing all the vowels present in it.*/


package LAB9_08_01_24;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input word/string
        System.out.print("Enter a word or string: ");
        String input = scanner.nextLine();

        // Remove vowels from the input string
        String result = removeVowels(input);

        // Display the result
        System.out.println("Result after removing vowels: " + result);

        scanner.close();
    }

    public static String removeVowels(String str) {
        // Define a string builder to store the result
        StringBuilder resultBuilder = new StringBuilder();

        // Iterate through each character in the input string
        for (char ch : str.toCharArray()) {
            // If the character is not a vowel, append it to the result string
            if (!isVowel(ch)) {
                resultBuilder.append(ch);
            }
        }

        // Convert the result string builder to a string and return
        return resultBuilder.toString();
    }

    public static boolean isVowel(char ch) {
        // Convert the character to lowercase for case-insensitive comparison
        ch = Character.toLowerCase(ch);
        // Check if the character is a vowel
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
