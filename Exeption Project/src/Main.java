import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            readFile("C:\\Users\\Rufat\\Desktop\\Rufat Proyekts\\Java projects\\Exeption Project\\src\\data.txt");
        } catch (IOException e) {
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        int i;
        // Faylın içini simvol-simvol oxumaq
        while ((i = fileReader.read()) != -1) {
            System.out.print((char) i);
        }
        fileReader.close(); // Faylı bağlamağı unutma
    }
}