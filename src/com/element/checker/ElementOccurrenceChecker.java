package com.element.checker;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ElementOccurrenceChecker
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(5, 4, 6, 9, 8, 10);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a number -> ");
        int guess = scanner.nextInt();

        if(numberList.contains(guess))
            System.out.println("Our number list contains the number " + guess);
        else
            System.out.println("Our number list doesn't contains the number " + guess);
    }
}
