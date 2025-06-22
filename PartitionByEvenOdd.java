import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEvenOdd {
    public static void main(String[] args) {
                List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

                 Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.partitioningBy(num->num%2==0));

    System.out.println("Even Numbers: " + partitioned.get(true));
        System.out.println("Odd Numbers: " + partitioned.get(false));
                }
}
