import java.util.function.Function;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class Main5 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByTwo = n -> n * 2;
        Function<Integer, Integer> subtractFive = n -> n - 5;
        Predicate<Integer> isPositive = n -> n > 0;

        boolean isFinalPositive = Stream.of(8)
                .map(multiplyByTwo)
                .map(subtractFive)
                .anyMatch(isPositive);
        if (isFinalPositive) {
            System.out.println("正の数です");
        } else {
            System.out.println("負の数または0です");
        }
    }
}
