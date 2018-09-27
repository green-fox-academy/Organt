import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonTest {
    static int a = 30;
    public static void mainDraw(Graphics graphics) {


        int number = 2;
        int height = 1 + (number - 1) * 2;
        double x1 = (a / 2) + (number - 1) * 3 * a / 2;
        double y1 = 0 + 0 * (int) h() / 2;
        int[] x = {(int)x1, (int)(x1 + a), (int)(x1 + a + a / 2), (int)(x1 + a), (int)(x1), (int)(x1 - a / 2)};
        int[] y = {(int)y1, (int)y1, (int)y1 + (int)h() / 2, (int)y1 + (int) h(), (int)y1 + (int) h(), (int)y1 + (int) h() / 2};



        hexagon(graphics, x, y);
    }



    public static void hexagon (Graphics graphics, int [] x, int [] y) {
        graphics.drawPolygon(x, y, 6);
    }
    public static double h (){
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