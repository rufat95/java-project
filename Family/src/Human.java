import java.time.LocalDateTime;

public class Human {
    public String name;
    public String surname;
    public LocalDateTime year;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public void greetPet(){
        System.out.println("Hello " + this.pet.nickname);
    }

    public void describePet(){
        System.out.println();
    }
}
