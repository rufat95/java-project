public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int fact){

        if (fact == 0){
            return 1;
        }
        return fact * factorial(fact - 1);
    }

//    public static int sum(int point){
//        if(point > 6){
//            return 0;
//        }
//        return point + sum(point + 1);
//    }

}