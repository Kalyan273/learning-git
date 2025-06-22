import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Bob", "David", "Alice");

        Set<String> name= new HashSet<>();

        List<String> duplicateNames =names.stream().filter(nam -> !name.add(nam)).distinct().collect(Collectors.toList());

        System.out.println(duplicateNames);

    }
}
