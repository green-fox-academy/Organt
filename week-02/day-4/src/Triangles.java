import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    static int a = 21;
    public static void mainDraw(Graphics graphics) {


        int lines = 20; int y = 0; int x = lines * (a / 2);
        for (int i = 1; i <= lines; i++) {
            for (int j = 0; j < i; j++) {
                triangle(graphics, x, y, a);
                x = x + a;
            }

            x = (lines - i) * (a / 2);
            y = (int) (y + h());
        }

    }

    public static void triangle (Graphics graphics, int x, int y, int a) {
        graphics.drawLine(x, y, x + a / 2, y + (int)h());
        graphics.drawLine(x + a / 2, y + (int)h(), x - a / 2, y + (int)h());
        graphics.drawLine( x - a / 2, y + (int)h(), x, y);
    }
    public static double h (){
        double h = Math.sqrt(Math.pow(a,2) - Math.pow(a/2, 2));
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