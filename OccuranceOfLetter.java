
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfLetter {
    public static void main(String[] args) {
        String input = "programming";

 //       char [] charString= input.toCharArray();
        Map<Character, Long> frequencyMap =input.chars().mapToObj(c-> (char) c).
        collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        System.out.println(frequencyMap);
    }
}
