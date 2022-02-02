package LargestElementProblem;

import java.util.Arrays;
import java.util.List;

public class LargestElement
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(5, 7, 11, 9, 17, 80);

        Integer largestNumber = LargestNumberOfList(numberList);
        System.out.println(largestNumber);

    }

    public static Integer LargestNumberOfList(List<Integer> numberList)
    {
        return numberList
                .stream()
                .max(Integer::compare).get();

    }
}
