import java.io.FileWriter;

public class FileManager {
    public static boolean saveFile(String text, String fileName){
        try {
            FileWriter myWriter = new FileWriter(fileName + ".txt");
            myWriter.write(text);
            myWriter.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
