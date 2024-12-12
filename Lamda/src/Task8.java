import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("C++");
        strings.add("Python");
        strings.add("Go");
        strings.add("Javascript");
        strings.add("C");

        String max = strings.stream()
                .reduce(strings.getFirst(), (a, b) -> (a.length() > b.length()) ? a : b);
        System.out.println(max);
    }
}
