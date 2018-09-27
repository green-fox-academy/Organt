import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class r2 {
    public static void mainDraw(Graphics graphics) {


        int lines = 14;
        int space = 15;
        graphics.setColor(new Color(0,170,0));
        graphics.drawLine(WIDTH/2, HEIGHT/2-lines*space, WIDTH/2, HEIGHT/2+lines*space);
        for (int i = 1; i < lines+1; i++) {
            //top left corner
            graphics.drawLine(WIDTH/2-i*space, HEIGHT/2, WIDTH/2, HEIGHT/2-(lines-i+1)*space);
            //top right corner
            graphics.drawLine(i*space+WIDTH/2, HEIGHT/2, WIDTH/2,HEIGHT/2-(space*(lines-i+1) ));
            //down left corner
            graphics.drawLine(WIDTH/2, HEIGHT/2 + space*i, WIDTH/2-((lines-i+1)*space), HEIGHT/2 );
            //down right corner
            graphics.drawLine(WIDTH/2+(i*space), HEIGHT/2, WIDTH/2,HEIGHT/2+((lines-i+1)*space));
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