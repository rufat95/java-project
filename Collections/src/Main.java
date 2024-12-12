import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> human1 = new ArrayList<>();
        human1.add(new Human("Nasir", 35));
        human1.add(new Human("Zamiq", 33));
        human1.add(new Human("Rufat", 29));
        human1.add(new Human("Murad", 24));

        human1.sort(Comparator.comparing(Human::getName).thenComparing(Human::getAge));

        for (Human h : human1){
            System.out.println(h);
        }
    }
}