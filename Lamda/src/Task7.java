import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("C++");
        strings.add("Python");
        strings.add("Go");
        strings.add("Javascript");
        strings.add("C");
        strings.add("");
        strings.add("");


        strings.stream()
                .filter(name -> name != "")
                .forEach(System.out::println);
    }
}
