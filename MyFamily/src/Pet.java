import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private String[] habit;
    private int age;
    private int tricklevel;

    public Pet(){

    }

    public Pet(String species, String nickname, int age, int tricklevel, String[] habit) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habit = habit;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public void setTricklevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }

    public String[] getHabit() {
        return habit;
    }

    public void setHabit(String[] habit) {
        this.habit = habit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && tricklevel == pet.tricklevel
                && Objects.equals(species, pet.species)
                && Objects.equals(nickname, pet.nickname)
                && Objects.deepEquals(habit, pet.habit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, Arrays.hashCode(habit), age, tricklevel);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", habit=" + Arrays.toString(habit) +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                '}';
    }
}
