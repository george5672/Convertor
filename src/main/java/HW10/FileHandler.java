package HW10;



import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    private final static String BASE_PATH = "files/";

    public String writeFile(String fileContent) {
        try(FileWriter fw = fileName + "my.txt") {
            fw(fileContent);
            return "Success.";
        } catch (Exception e) {
            return null;
        }
    }

    public String readFile(String path) {
        try (FileReader reader = new FileReader()) {
            int sym;
            new StringBuilder();
            while ((sym = reader.read()) != -1) {
                StringBuilder.append((char) sym);
            }
            return null;
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
