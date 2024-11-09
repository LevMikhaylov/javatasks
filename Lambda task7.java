import java.util.Random;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> randomNumbers = random.ints(10)
                .map(num -> random.nextInt(21)-10)
                .boxed()
                .toList();

        randomNumbers.forEach(System.out::println);
    }
}
