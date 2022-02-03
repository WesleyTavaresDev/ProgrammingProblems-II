package OddPositionsProblem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddPositions
{
    public static void main(String[] args)
    {
        List<Integer> numberList = Arrays.asList(5, 13, 40, 41, 6, 8);

        for(int i = 0; i < numberList.size(); i++)
        {
            if(i % 2 == 0)
                continue;
            System.out.println(numberList.get(i));
        }
    }
}
