import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CircleFractal {

    public static void mainDraw(Graphics graphics) {
        double r = WIDTH - Math.random()*100;
        fractalC(graphics, WIDTH /2, WIDTH / 2, r);
    }

    public static void fractalC(Graphics graphics, double x, double y, double r) {
        if (r <= 50) {
            DrawCircle.circleFromCenter(graphics, x, y, r);
        }
        else {
            DrawCircle.circleFromCenter(graphics, x, y, r);
            fractalC(graphics, x, y - r / 4, r / 2 );
            fractalC(graphics, x + distanceOfCenter(r), y + distanceOfCenter(r), r / 2 );
            fractalC(graphics, x - distanceOfCenter(r), y + distanceOfCenter(r), r / 2 );
        }
    }

    public static double distanceOfCenter(double r) {
        double d = (r / 4) / Math.sqrt(2);
        return d;
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