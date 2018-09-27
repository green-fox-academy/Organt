import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    static int a = 30;

    public static void mainDraw(Graphics graphics) {


        int number = 4;
        int height = 1 + (number - 1) * 2;




        for (int i = 0; i < number; i++) {
            int x1 = (int) ((a / 2 + (number - 1) * 3 * a / 2) - i * (3 * a / 2));
            int y1 = (int) 0 + i * ((int) h() / 2);

            for (int j = 0; j < height-i; j++) {
                hexagon(graphics, x1, y1);
                if (i > 0){
                    hexagon(graphics, x1 + 2 * (i * (3 * a / 2)), y1);
                }
                y1 = y1 + (int) h();
            }


        }




    }

    public static void hexagon(Graphics graphics, int x1, int y1) {
        int[] x = {(int)x1, (int)(x1 + a), (int)(x1 + a + a / 2), (int)(x1 + a), (int)(x1), (int)(x1 - a / 2)};
        int[] y = {(int)y1, (int)y1, (int)y1 + (int)h() / 2, (int)y1 + (int) h(), (int)y1 + (int) h(), (int)y1 + (int) h() / 2};

        graphics.drawPolygon(x, y, 6);
    }

    public static double h() {
        double h = 2 * a * (Math.sqrt(3) / 2);
        return h;
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