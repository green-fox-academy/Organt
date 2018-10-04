import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleFractal {

    public static void mainDraw(Graphics graphics) {
        double a = WIDTH / 2 - Math.random()*60;
        int[] x = {(int)(WIDTH / 2 - a ), (int)(WIDTH / 2 + a), WIDTH / 2};
        int [] y = {5, 5, 5 + (int)(2 * h(a))};
        graphics.setColor(RandomColor.getColor());
        graphics.fillPolygon( x, y, 3);
        fractalT(graphics, WIDTH / 2, 5, a);
    }

    public static void fractalT(Graphics graphics, double x, double y, double a) {
        if (a <= 10) {
            DrawTriangle.fromTop(graphics, x, y, a);
        }
        else {
            DrawTriangle.fromTop(graphics, x, y, a);
            fractalT(graphics, x - a / 2, y, a / 2);
            fractalT(graphics, x + a / 2, y, a / 2);
            fractalT(graphics, x, y + h(a), a / 2);

        }
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