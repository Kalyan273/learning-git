import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterInteger {
    public static void main(String[] args) {
        int [] arr= new int[]{2,6,5,7,8,9,10};
        List<Integer> num= new ArrayList<>();
         for (int i : arr) {
            num.add(i); // Autoboxing converts int to Integer
        }

        List<Integer> evenNum=num.stream().filter(number ->number%2==0).
        collect(Collectors.toList());
        System.out.println(evenNum);
        
    }
}

