package com.palindrome;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

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
        return  Stream.of(word)
                .map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining(" "));
    }
}
