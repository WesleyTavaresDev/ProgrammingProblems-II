package PalindromeProblem;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Please, digit a word/phrase ->");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if(reverseString(word).equals(word))
            System.out.printf("%s is a palindrome. %nReversed -> %s", word, reverseString(word));
        else
            System.out.println("it's not a palindrome");

    }

    public  static  String reverseString(String word)
    {
        if(word.length() <= 1)
            return word;

        StringBuilder reversedString = new StringBuilder();
        for(int i = word.length() - 1; i >= 0; i--)
            reversedString.append(word.charAt(i));

        return reversedString.toString();
    }
}
