import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainboxBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int size = WIDTH;
        for (int i = 0; i < 5000; i++) {
        size = size - (int)(Math.random()*10);
        square(graphics, size, (int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        }
        }





    public static void square (Graphics graphics, int size, int r, int g, int b) {
        graphics.setColor(new Color(r,g,b));
        graphics.fillRect(WIDTH/2-size/2, HEIGHT/2-size/2, size, size);

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