import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {


        int lines = 14;
        int space = 20;
        for (int i = 1; i < lines+1; i++) {
            graphics.setColor(new Color(0,170,0));
            graphics.drawLine(i*space, HEIGHT, 0,HEIGHT-(space*(lines-i+1) ));


            graphics.setColor(new Color(200, 0, 100));
            graphics.drawLine(WIDTH, space*i, WIDTH-((lines-i+1)*space), 0 );
        }



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