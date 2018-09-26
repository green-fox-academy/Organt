import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}


        int [][] example = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int [][] example2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                 {120, 100}, {85, 130}, {50, 100}};

        connect(graphics, example2);

    }

    public static void connect (Graphics graphics, int [][] newArray){
        for (int i = 0; i < newArray.length-1; i++) {
            graphics.drawLine(newArray[i][0], newArray[i][1], newArray[i+1][0], newArray[i+1][1]);
        }
        graphics.drawLine(newArray[newArray.length-1][0], newArray[newArray.length-1][1], newArray[0][0], newArray[0][1]);
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}


// create a 300x300 canvas.