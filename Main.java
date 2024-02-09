/* Q1 : -  Write a method that takes a String and returns a String of the same length 
containing the 'X' character in all positions except the last 4 positions. 
The characters in the last 4 positions must be the same as in the original string. 
For example, if the argument is
"12345678", the return value should be "XXXX5678".*/



package LAB9_08_01_24;

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String result = replaceWithX(input);
        System.out.println("Result: " + result);
    }

    public static String replaceWithX(String input) 
    {
        int length = input.length();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < length - 4; i++) 
        {
            result.append('X');
        }
        
        result.append(input.substring(length - 4));
        return result.toString();
    }
}

