package com.element.largest;

import java.util.Arrays;
import java.util.List;

public class LargestElement
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(5, 7, 11, 9, 17, 80, 654);

        System.out.println(largestNumberOfList(numberList));
    }

    public static Integer largestNumberOfList(List<Integer> numberList)
    {
        return numberList
                .stream()
                .max(Integer::compare).orElse(Integer.MAX_VALUE);
    }
}
