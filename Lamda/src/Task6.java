import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("C++");
        strings.add("Python");
        strings.add("Go");
        strings.add("javascript");
        strings.add("c");

        strings.stream()
                .filter(name -> name.startsWith("P"))
                .forEach(System.out::println);
    }
}
