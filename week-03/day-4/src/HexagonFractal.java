import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HexagonFractal {

    public static void mainDraw(Graphics graphics) {
        double a = WIDTH /2 - Math.random()*50;
        fractalH(graphics, WIDTH / 2, WIDTH /2, a);
    }

    public static void fractalH(Graphics graphics, double x, double y, double a) {
        if (a <= 5) {
            DrawHexagon.fromCenter(graphics, x, y, a);
        }
        else {
            DrawHexagon.fromCenter(graphics, x, y, a);
            fractalH(graphics, x - a / 3, y - (h(a) / 2 * 2 / 3), a / 3);
            fractalH(graphics, x + a / 3, y - (h(a) / 2 * 2 / 3), a / 3);
            fractalH(graphics, x +  2 * a / 3, y, a / 3);
            fractalH(graphics, x + a / 3, y + (h(a) / 2 * 2 / 3), a / 3);
            fractalH(graphics, x - a / 3, y + (h(a) / 2 * 2 / 3), a / 3);
            fractalH(graphics, x - 2 * a / 3, y, a / 3);
        }
    }

    public static double h(double a) {
        double h = 2 * a * (Math.sqrt(3) / 2);
        return h;
    }

    //    public static void fractalC(Graphics graphics, double x, double y, double r) {
//        if (r <= 50) {
//            DrawCircle.circleFromCenter(graphics, x, y, r);
//        }
//        else {
//            DrawCircle.circleFromCenter(graphics, x, y, r);
//            fractalC(graphics, x, y - r / 4, r / 2 );
//            fractalC(graphics, x + distanceOfCenter(r), y + distanceOfCenter(r), r / 2 );
//            fractalC(graphics, x - distanceOfCenter(r), y + distanceOfCenter(r), r / 2 );
//        }
//    }
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
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            panel.repaint();
        }
    }

    static class ImagePanel extends JPanel {

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}