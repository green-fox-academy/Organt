import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ReproduceSquares {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillRect(0, 0, 500, 500);
        graphics.setColor(Color.black);
        graphics.drawRect(0, 0, 500, 500);
        fractals(graphics, 0, 0, WIDTH);


        }
    public static void fourSquares(Graphics graphics, int x, int y, double width) {
            graphics.drawLine(x + (int)(width / 3), y, x + (int)(width / 3), y + (int)width);
            graphics.drawLine(x + (int)(width * 2 / 3), y, x + (int)(width * 2 / 3), y + (int)width);
            graphics.drawLine(x, y + (int)(width / 3), x + (int)width, y + (int)(width / 3));
            graphics.drawLine(x, y + (int)(width * 2 / 3), x + (int)width, y + (int)(width * 2 / 3));
        }
    public static void fractals(Graphics graphics, double x, double y, double width) {
        if (width <= 1) {
            fourSquares(graphics, (int)x, (int)y, (int)width);
        }
        else {
            fourSquares(graphics, (int)x, (int)y, width);
            fractals(graphics, (x + (width / 3)), y, (width / 3));
            fractals(graphics, x + (width / 3), y + (width * 2 / 3), (width / 3));
            fractals(graphics, x , y + (width / 3), (width / 3));
            fractals(graphics, x + (width * 2 / 3), y + (width / 3), (width / 3));



        }
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}