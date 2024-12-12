import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("C++");
        strings.add("Python");
        strings.add("Go");
        strings.add("Javascript");
        strings.add("C");
        strings.add("Assembly");

        strings.stream()
                .map(name -> name + ", " )
                .forEach(System.out::print);


        String s = strings.stream().reduce("", (a, b) -> a + b + " ,");

        System.out.println(s);
    }
}
