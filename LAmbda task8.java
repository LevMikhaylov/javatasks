import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("radar", "hello", "level", "world", "racecar");

        strings.stream()
                .filter(str -> {
                    String reversed = new StringBuilder(str).reverse().toString();
                    return str.equals(reversed);
                })
                .forEach(System.out::println);
    }
}
