import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        String result = strings.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Объединенные строки: " + result);
    }
}
