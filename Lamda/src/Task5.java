import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("C++");
        strings.add("Python");
        strings.add("Go");
        strings.add("Javascript");
        strings.add("C");
        strings.add("Assembly");

        strings.stream().sorted()
                .forEach(System.out::println);
    }
}
