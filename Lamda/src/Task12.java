import java.util.ArrayList;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<Integer> strings = new ArrayList<>();
        strings.add(1);
        strings.add(2);
        strings.add(3);
        strings.add(4);
        strings.add(5);
        strings.add(6);


        strings.stream()
                .map(num -> num + 2 )
                .forEach(System.out::println);
    }
}
