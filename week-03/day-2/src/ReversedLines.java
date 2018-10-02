import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt


        reverse("reversed-lines.txt");
    }

    public static void reverse(String filename) {
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            String newFile = "";
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).length() > 0) {
                    for (int j = 0; j < lines.get(i).length()-1; j++) {
                        newFile = newFile + lines.get(i).charAt(lines.get(i).length()-1-j);
                    }
                    newFile = newFile + lines.get(i).charAt(0) + "\n";
                }
                else newFile = newFile + "\n";
            }
            System.out.println(newFile);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}