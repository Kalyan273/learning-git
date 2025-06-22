import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args) {
        List<String> num= Arrays.asList("Alice", "Adam", "Bob", "Angela", "Brian", "Ankit");
        
        char startWith='A';

        List<String> filterWords=num.stream().filter(words-> words.startsWith(String.valueOf(startWith))).collect(Collectors.toList());
        Long wordsCount=num.stream().filter(words-> words.startsWith(String.valueOf(startWith))).count();

         
        System.out.println(filterWords);
        System.out.println(wordsCount);
    }
}
