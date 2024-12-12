import java.util.ArrayList;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        List<Integer> strings = new ArrayList<>();
        strings.add(2);
        strings.add(3);
        strings.add(4);


        var c = strings.stream()
                .reduce(1, (a, b) -> a*b);
        System.out.println(c);
    }
}
