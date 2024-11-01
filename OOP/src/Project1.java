public class Project1 {
    static private int height;
    static private int width;
    static private int depth;
    static private int weigth;

    public Project1(){
        this(7,7,7);
        System.out.println("Defaul Constructure");
    }
    public Project1(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        System.out.println("Second Constructure");
        var salam  = 6;
    }

    public static int volume(){
        return height * width * depth;
    }
}
