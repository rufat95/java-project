public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int tricklevel;
    public String[] habit;

    public void eat(){
        System.out.println("I am Eating");
    }
    public void respond(){
        System.out.println("Hello, owner. I am - " + nickname + " I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up");
    }
}
