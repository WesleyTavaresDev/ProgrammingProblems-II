package LargestElementProblem;

import java.util.Arrays;
import java.util.List;

public class LargestElement
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(5, 7, 11, 9, 17, 80);

        Integer largestNumber = numberList
                .stream()
                .max(Integer::compare).get();

        System.out.println(largestNumber);

    }
}
