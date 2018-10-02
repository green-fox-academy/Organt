import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        System.out.println(ticTacResult("win-o.txt"));
        // should print O

        System.out.println(ticTacResult("win-x.txt"));
        // should print X

        System.out.println(ticTacResult("draw.txt"));
        // should print draw
    }
    public static String ticTacResult (String filename) {
        try {
            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            String[][] matrix = new String[lines.size()][lines.size()];
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.size(); j++) {
                    matrix[i][j] = "" + lines.get(i).charAt(j);
                }
            }
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.size() - 1; j++) {
                    if (!matrix[i][j].equals(matrix[i][j + 1])) {
                        j = lines.size();
                    }
                    else if (j == lines.size() - 2){
                        return matrix[i][j];
                    }
                }
            }
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.size() - 1; j++) {
                    if (!matrix[j][i].equals(matrix[j + 1][i])) {
                        j = lines.size();
                    }
                    else if (j == lines.size() - 2){
                        return matrix[j][i];
                    }
                }
            }
            for (int i = 0; i < lines.size()-1; i++) {
                    if (!matrix[i][i].equals(matrix[i + 1][i + 1])) {
                        i = lines.size();
                    }
                    else if (i == lines.size() - 2){
                        return matrix[i][i];
                    }

            }



            return "draw";
        }
        catch (Exception e){return "unable to read a file";}

    }
}