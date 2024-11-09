public class Main {
    public static void main(String[] args) {
        List<Integer> l =  new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(6);
        l.add(-8);
        l.add(-9);
        l.add(1);
        Function<Integer,Integer>doublenum = n->n*2;
        l.forEach(num -> System.out.println(doublenum.apply(num)));
    }
}
