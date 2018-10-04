import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleFractal {

    public static void mainDraw(Graphics graphics) {
        int[] x = {0, WIDTH, WIDTH / 2};
        int [] y = {5, 5, 5 + (int)(2 * h(WIDTH / 2))};
        graphics.drawPolygon( x, y, 3);
        fractalT(graphics, WIDTH / 2, 5, WIDTH / 2);
    }

    public static void fractalT(Graphics graphics, double x, double y, double a) {
        if (a <= 10) {
            triangle(graphics, x, y, a);
        }
        else {
            triangle(graphics, x, y, a);
            fractalT(graphics, x - a / 2, y, a / 2);
            fractalT(graphics, x + a / 2, y, a / 2);
            fractalT(graphics, x, y + h(a), a / 2);

        }
    }
//    public static void hex(Graphics graphics, double x, double y, double a) {
//        if (a <= 30) {
//            hexagon(graphics, x, y, a);
//        }
//        else {
//            hexagon(graphics, x, y, a);
//            hex(graphics, x - a / 4, y - h(a) / 4, a /2);
//            hex(graphics, x + a / 2, y, a / 2);
//            hex(graphics, x - a / 4, y + h(a) / 4, a / 2);
//        }
//    }
    public static void triangle(Graphics graphics, double x1, double y1, double a) {
        int[] x = {(int)x1,  (int)(x1 + a /2), (int)(x1 - a / 2)};
        int[] y = {(int)y1, (int)(y1 + h(a)), (int)(y1 + h(a))};

        graphics.drawPolygon(x, y,3);
    }


    public static double h(double a) {
        double h = a * (Math.sqrt(3) / 2);
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