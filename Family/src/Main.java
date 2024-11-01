import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human();
        mother.name = "Nigar";

        Human father = new Human();
        father.name = "Rufat";

        Random rand = new Random();
        int randomTrick = rand.nextInt(0, 100);

        String[][] schedule = {
                {"Monday",    "Gym",        "Reading"},
                {"Tuesday",   "Running",    "Cooking"},
                {"Wednesday", "Swimming",   "Painting"},
                {"Thursday",  "Yoga",       "Gaming"},
                {"Friday",    "Cycling",    "Photography"},
                {"Saturday",  "Hiking",     "Gardening"},
                {"Sunday",    "Rest",       "Family Time"}
        };
        // Human //////////////////////////
        Human human1 = new Human();
        human1.name = "Raul";
        human1.surname = "Hesenzade";
        human1.year = LocalDateTime.of(2019, 11, 3, 20, 27, 25);
        human1.iq = 300;
        human1.mother = mother;
        human1.father = father;
        human1.schedule = schedule;

        // Pet //////////////////////////

        Pet pet = new Pet();
        pet.species = "Cat";
        pet.nickname = "Kity";
        pet.age = 1;
        pet.tricklevel = randomTrick;
        String[] habits = new String[3];
        habits[0] = "to climb";
        habits[1] = "more sleeping";
        habits[2] = "to purr";
        pet.habit = habits;
        human1.pet = pet;

        for(String[] i: human1.schedule)
        {
            for(String current: i)
            {
                System.out.print(current + ", ");
            }
        }
        System.out.println();
        for (String habit : pet.habit){
            System.out.println(habit + ", ");
        }

        human1.greetPet();
    }
}