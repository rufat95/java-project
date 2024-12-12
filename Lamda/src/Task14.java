import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task14 {
    public static void main(String[] args) {
        List<Integer> strings = new ArrayList<>();
        strings.add(2);
        strings.add(3);
        strings.add(4);
        strings.add(5);
        strings.add(6);


        var a = strings.stream()
                .min(Integer::compare).get();

        System.out.println(a);
    }
}
