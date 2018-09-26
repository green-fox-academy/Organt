import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.


        int x = 0;
        int y = 0;
        for (int i = 0; i <= HEIGHT / 20 +1; i++) {
            for (int j = 0; j <= WIDTH / 20; j++) {
                if ((x == 0) || (y == 0) || (x == WIDTH) || (y == HEIGHT-1)) {
                    line(graphics, x, y);
                }
                x= x+20;
            }
            x = 0;
            if (y < HEIGHT-20){
            y = y + 20;}
            else { y = HEIGHT-1;}

        }
    }

    public static void line (Graphics graphics, int x, int y) {
        graphics.drawLine(x, y, WIDTH/2, HEIGHT/2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
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