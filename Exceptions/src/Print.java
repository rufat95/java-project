public class Print {
    public void printString(String word){
        if(word.length() > 10){
            throw new RuntimeException("Soz 10 herifden boyuk ola bilmez ay men deyen...");
        }
    }
}
