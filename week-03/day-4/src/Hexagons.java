import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {

    public static void mainDraw(Graphics graphics) {
        hex(graphics, WIDTH / 2, WIDTH / 2, WIDTH / 2);
    }

    public static void hex(Graphics graphics, double x, double y, double a) {
        if (a <= 30) {
            hexagon(graphics, x, y, a);
        }
        else {
            hexagon(graphics, x, y, a);
            hex(graphics, x - a / 4, y - h(a) / 4, a /2);
            hex(graphics, x + a / 2, y, a / 2);
            hex(graphics, x - a / 4, y + h(a) / 4, a / 2);
        }
    }
    public static void hexagon(Graphics graphics, double s1, double s2, double a) {
        double x1 = s1 - a / 2;
        double y1 = s2 - h(a) / 2;
        int[] x = {(int)x1, (int)(x1 + a), (int)(x1 + a + a / 2), (int)(x1 + a), (int)(x1), (int)(x1 - a / 2)};
        int[] y = {(int)y1, (int)y1, (int)(y1 + h(a) / 2), (int)y1 + (int) h(a), (int)(y1 +  h(a)), (int)(y1 + h(a) / 2)};

        graphics.drawPolygon(x, y, 6);
    }


    public static double h(double a) {
        double h = 2 * a * (Math.sqrt(3) / 2);
        return h;
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