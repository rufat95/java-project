import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pet yumru = new Pet();
        yumru.setSpecies("Cat");
        yumru.setNickname("Yumru");
        yumru.setAge(2);
        yumru.setTricklevel(5);

        Human rufat = new Human();
        rufat.setName("Rufat");
        rufat.setSurname("Hesenzade");
        rufat.setYear(LocalDate.of(1995, 12, 14));
        rufat.setIq(460);

        Human nigar = new Human();
        nigar.setName("Nigar");
        nigar.setSurname("Hesenzade");
        nigar.setYear(LocalDate.of(1994, 8, 29));
        nigar.setIq(500);
        
        Human raul = new Human();
        raul.setName("Raul");
        raul.setSurname("Hesenzade");
        raul.setYear(LocalDate.of(2019, 11, 3));
        raul.setIq(1000);
        
        Family hesenzadeler = new Family();
        hesenzadeler.setFather(rufat);
        hesenzadeler.setMother(nigar);
        hesenzadeler.setChild(raul);
        hesenzadeler.setPet(yumru);

    }
}