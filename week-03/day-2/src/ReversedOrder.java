import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt


        order("reversed-order.txt");
    }
    public static void order(String filename) {
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            String newFile = "";
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(lines.size()-1-i).length() > 0) {
                    for (int j = 0; j < lines.get(lines.size()-1-i).length(); j++) {
                        newFile = newFile + lines.get(lines.size()-1-i).charAt(j);
                    }
                    newFile = newFile + "\n";
                }
                else newFile = newFile + "\n";
            }
            System.out.println(newFile);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}