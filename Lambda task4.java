import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> l =  new ArrayList<>();
        l.add("abc");
        l.add("defgh");
        l.add("gjfjfjfjfjf");
        l.add("dfdf");
        l.add("sdqewqe2");
        l.add("sdqwee3e3da");
        List<String>words=l.stream().filter(s->s.length()>5).toList();
        words.forEach(System.out::println);
    }
}
