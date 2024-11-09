import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("JavaScript");
        strings.add("Python");
        strings.add("C++");
        strings.add("Jupiter");
        char targetLetter = 'J';
        long count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(targetLetter)))
                .count();
        System.out.println("Количество строк, начинающихся с буквы '" + targetLetter + "': " + count);
    }
    }
