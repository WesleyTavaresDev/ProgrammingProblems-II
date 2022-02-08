package com.list.reverse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListReverser
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(6, 13, 5, 10, 40);

        System.out.println("Reversed with Stream ->");
        System.out.println(streamReverseList(numberList));
    }

    public static List<Integer> streamReverseList(List<Integer> numberList)
    {
        return  numberList
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
