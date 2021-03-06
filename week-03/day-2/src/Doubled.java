import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        decrypt("duplicated-chars.txt");


    }
    public static void decrypt (String filename) {
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            String newFile = "";
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).length() > 0) {
                    for (int j = 0; j < lines.get(i).length()-1; j++) {
                        if (lines.get(i).charAt(j) != lines.get(i).charAt(j+1)){
                            newFile = newFile + lines.get(i).charAt(j);}
                    }
                    newFile = newFile + lines.get(i).charAt(lines.get(i).length()-1) + "\n";
                }
                else newFile = newFile + "\n";
            }
            System.out.println(newFile);
        }
        catch (Exception e) {
            System.out.println("Couldn't find the file");
        }
    }
}