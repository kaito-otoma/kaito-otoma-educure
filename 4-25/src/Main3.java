import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "date", "cherry", "elderberry");
        List<String> wordStream = words.stream()
                                        .sorted()
                                        .filter(w -> w.length() >= 5)
                                        .collect(Collectors.toList());
            System.out.println(wordStream);

    }
}
