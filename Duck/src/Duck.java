public abstract class Duck {
    Flyable flyBehavior;
    Quackable quackBehavior;

    public Duck(){}

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Bütün ördəklər üzə bilir.");
    }

    public abstract void display();
}
