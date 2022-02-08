package com.list.sum;

import java.util.Arrays;
import java.util.List;

public class ElementsSum
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(4, 8, 9, 40, 3, 5, 7);
        System.out.println(sumElements(numberList));
    }

    public static Integer sumElements(List<Integer> numbers)
    {
        return  numbers
                .stream()
                .mapToInt(i -> i)
                .sum();
    }
}
