import java.util.Objects;
import java.time.LocalDate;

public class Human {
    private String name;
    private String surname;
    private LocalDate year;
    private int iq;

    public Human(){}

    public Human(String name, String surname, LocalDate year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return iq == human.iq
                && Objects.equals(name, human.name)
                && Objects.equals(surname, human.surname)
                && Objects.equals(year, human.year);
      }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                '}';
    }
}
