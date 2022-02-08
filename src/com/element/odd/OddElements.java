package com.element.odd;

import java.util.Arrays;
import java.util.List;

public class OddElements
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(5, 13, 40, 41, 6, 8);

        numberList
                .stream()
                .filter(o -> o % 2 != 0)
                .forEach(System.out::println);
    }
}
