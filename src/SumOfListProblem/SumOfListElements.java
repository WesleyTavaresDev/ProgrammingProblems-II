package SumOfListProblem;

import java.util.Arrays;
import java.util.List;

public class SumOfListElements
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(4, 8, 9, 40, 3, 5, 7);
        System.out.println(SumElements(numberList));
    }

    public static Integer SumElements(List<Integer> numbers)
    {
        return  numbers
                .stream()
                .mapToInt(i -> i)
                .sum();
    }
}