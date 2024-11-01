import java.util.Objects;

public class Family{
    private Human mother;
    private Human father;
    private Human child;
    private Pet pet;

    public Family(){}

    public Family(Human mother, Human father, Human child, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.child = child;
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getChild() {
        return child;
    }

    public void setChild(Human child) {
        this.child = child;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother)
                && Objects.equals(father, family.father)
                && Objects.equals(child, family.child)
                && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, child, pet);
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
