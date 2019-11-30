import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println("=============");
        System.out.println(set.add("a"));
        System.out.println(set);
        System.out.println(set.size());
        System.out.println("=============");
        System.out.println(set.remove("a"));
        System.out.println(set);
        System.out.println(set.size());
        System.out.println("=============");
        System.out.println(set.contains("b"));
        System.out.println("=============");
        set.clear();
        System.out.println(set);
        System.out.println(set.size());

    }
}
