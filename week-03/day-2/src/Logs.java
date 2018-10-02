import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

        List<String> lines = null;
        try {
            Path filePath = Paths.get("log.txt");
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < ip(lines).size(); i++) {
            System.out.println(ip(lines).get(i));
        }
        System.out.println(ip(lines).size());
        ratio(lines);



    }
    public static List<String> ip (List lines) {
        List<String> ips = new ArrayList<String>();
        ips.add(lines.get(0).toString().substring(27, 38));
        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < ips.size(); j++) {
                if (!lines.get(i).toString().substring(27, 38).equals(ips.get(j)) && j == ips.size() - 1){
                    ips.add(lines.get(i).toString().substring(27, 38));
                }
            }
        }
        return ips;
    }

    public static void ratio (List lines) {
        int get = 0;
        int post = 0;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).toString().substring(41, 45).equals("POST")) {
                post++;
            }
            else get++;
        }
        System.out.println("GET/POST ratio: " + get + "/" + post);


    }
}
