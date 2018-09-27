import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {

        int x = 64;

        for (int i = 0; i < (int)Math.sqrt(x); i++) {
            for (int j = 0; j < (int)Math.sqrt(x); j++) {
                r1(graphics, x, i, j);
            }
        }



    }
    public static void r1 (Graphics graphics, int x, int r, int c){
        int lines = 14;
        int space = 30/(int)Math.sqrt(x);
        for (int i = 1; i < lines+1; i++) {
            graphics.setColor(new Color(0,170,0));
            graphics.drawLine((i*space + c * WIDTH/(int)Math.sqrt(x)), (r+1)*HEIGHT/(int)Math.sqrt(x), 0 + c * WIDTH/(int)Math.sqrt(x),r * HEIGHT/(int)Math.sqrt(x) + HEIGHT/(int)Math.sqrt(x)-(space*(lines-i+1) ));



            graphics.setColor(new Color(200, 0, 100));
            graphics.drawLine(WIDTH/(int)Math.sqrt(x) + c * WIDTH/(int)Math.sqrt(x), space*i + r*HEIGHT/(int)Math.sqrt(x), WIDTH/(int)Math.sqrt(x)-((lines-i+1)*space)+ c * WIDTH/(int)Math.sqrt(x), r * HEIGHT/(int)Math.sqrt(x) );
        }


    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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