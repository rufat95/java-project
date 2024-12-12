import java.io.*;

public class Task4 {
    private static final File file = new File("test.txt");
    public static void main(String[] args) {
        writeToFile();
    }

    private static void checkFile(){
        try {
            boolean newFile = file.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("file not created");
        }
    }

    private static void deleteFile(){
        boolean delete = file.delete();
        System.out.println(delete);
    }

    private static void writeToFile(){
        try(FileWriter fw = new FileWriter(file, true)) {
            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write("Agilli olun !");
            bfw.close();
        } catch (IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
