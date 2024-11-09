import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<Integer> l =  new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(-8);
        l.add(-9);
        l.add(1);
        List<Integer>pos = l.stream().filter(n->n>0).collect(Collectors.toList());
        pos.forEach(System.out::println);
    }
}
