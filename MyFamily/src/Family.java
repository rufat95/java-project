import java.util.Objects;

public class Family extends Human{
    private Human mother;
    private Human father;
    private Human child;
    private Pet pet;

    public Family(){

    }

    public Family(Human mother, Human father, Human child, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.child = child;
        this.pet = pet;
    }

    @Override
    public Human getMother() {
        return mother;
    }

    @Override
    public void setMother(Human mother) {
        this.mother = mother;
    }

    @Override
    public Human getFather() {
        return father;
    }

    @Override
    public void setFather(Human father) {
        this.father = father;
    }

    public Human getChild() {
        return child;
    }

    public void setChild(Human child) {
        this.child = child;
    }

    @Override
    public Pet getPet() {
        return pet;
    }

    @Override
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(child, family.child) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mother, father, child, pet);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", child=" + child +
                ", pet=" + pet +
                '}';
    }
}
