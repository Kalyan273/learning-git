import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie", "Bob");
        List<String> distint =names.stream().distinct().collect(Collectors.toList());

        System.out.println(distint);


    }
}
