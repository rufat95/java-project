import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Kalkulyatora xoş gəlmisiniz!");
        loop();
    }
//    ///////////////////////////////////////////
    private static int getPlus(int a, int b){
        int result = a+b;
        return result;
    }
    private static int getMinus(int a, int b){
        int result = a-b;
        return result;
    }
    private static int getMultiplication(int a, int b){
        int result = a*b;
        return result;
    }
    private static int getDivide(int a, int b){
        int result = a/b;
        return result;
    }
    static int  counter = 0;
    private static void setOperation(){
        System.out.println("""
                1. Üstəgəlma
                2. Çıxma
                3. Vurma
                4. Bölmə """);
        Scanner scan = new Scanner(System.in);
        System.out.print("Zəhmət olmasa istədiyiniz əməliyyatı seçin: ");
        int calculatorCase = scan.nextInt();


        if(calculatorCase > 0 && calculatorCase < 5)
        {
            System.out.print("Zəhmət olmasa birinci ədədi daxil edin: ");
            int number1 = scan.nextInt();
            System.out.print("Zəhmət olmasa ikinci ədədi daxil edin: ");
            int number2 = scan.nextInt();
            switch (calculatorCase){
                case 1:
                    int resultPlus = getPlus(number1, number2);
                    System.out.println("Nəticə: " + resultPlus);
                    break;
                case 2:
                    int resultMinus = getMinus(number1, number2);
                    System.out.println("Nəticə: " + resultMinus);
                    break;
                case 3:
                    int resultMultiplication = getMultiplication(number1, number2);
                    System.out.println("Nəticə: " + resultMultiplication);
                    break;
                case 4:
                    int resultDivided = getDivide(number1, number2);
                    System.out.println("Nəticə: " + resultDivided);
                    break;
                default:
                    System.out.println("Əməliyyat düzgün seçilməyib...");
            }
        }
        else
        {
            System.out.println("ƏMƏLİİYAT DÜZGÜN SEÇİLMƏYİB ! ZƏHMƏT OLMASA 1-4 ARASINDA İSTƏDİTİNİZ ƏMƏLİİYATI SEÇİN...");
            ++counter;
            if (counter == 3){
                System.out.println("XIYAR, KORSAAAAAAAAAAAN!");
            }
            System.out.println();
        }
    }
    private static void loop(){

        while (true){
            setOperation();
        }
    }

}
