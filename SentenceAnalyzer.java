/*Q4. WAP to enter any sentence and calculate the following:
  a) Total number of digits present in it.
  b) Total number of small letters and capital letters present in it.
  c) Total number of alphabets used in it.
  d) Total number of special character used in it.
  e) Total number of vowels presents in it.
  f) Total Number words present in that sentence.
*/

package LAB9_08_01_24;

import java.util.Scanner;

public class SentenceAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        int digitCount = 0;
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int alphabetCount = 0;
        int specialCharCount = 0;
        int vowelCount = 0;
        int wordCount = 0;

        for (char ch : sentence.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
                alphabetCount++;
                if (isVowel(ch)) {
                    vowelCount++;
                }
            } else if (Character.isUpperCase(ch)) {
                uppercaseCount++;
                alphabetCount++;
                if (isVowel(ch)) {
                    vowelCount++;
                }
            } else if (Character.isLetter(ch)) {
                alphabetCount++;
            } else {
                specialCharCount++;
            }
        }

        String[] words = sentence.split("\\s+");
        wordCount = words.length;

        System.out.println("Choose the operation:");
        System.out.println("1. Total number of digits");
        System.out.println("2. Total number of small letters");
        System.out.println("3. Total number of capital letters");
        System.out.println("4. Total number of alphabets used");
        System.out.println("5. Total number of special characters used");
        System.out.println("6. Total number of vowels");
        System.out.println("7. Total number of words");
        System.out.println("8. Exiting");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Total number of digits: " + digitCount);
                break;
            case 2:
                System.out.println("Total number of small letters: " + lowercaseCount);
                break;
            case 3:
                System.out.println("Total number of capital letters: " + uppercaseCount);
                break;
            case 4:
                System.out.println("Total number of alphabets used: " + alphabetCount);
                break;
            case 5:
                System.out.println("Total number of special characters used: " + specialCharCount);
                break;
            case 6:
                System.out.println("Total number of vowels: " + vowelCount);
                break;
            case 7:
                System.out.println("Total number of words: " + wordCount);
                break;
            case 8:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice! Please enter a valid option.");
        }

        scanner.close();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
