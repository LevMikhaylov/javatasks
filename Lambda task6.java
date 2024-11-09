import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> l =  new ArrayList<>();
        l.add(6);
        l.add(-9);
        l.add(6);
        l.add(-8);
        l.add(1);
        l.add(2);
        l.forEach(n-> System.out.println(n*3));
    }
}
