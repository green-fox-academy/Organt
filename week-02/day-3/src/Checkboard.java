import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int size = 30;
        for (int i = 0; i < HEIGHT / size ; i++) {

            for (int j = 0; j < WIDTH / size; j++) {
                if ((j % 2 == 0) && (i % 2 == 0) || (j % 2 != 0) && (i % 2 != 0)){
                    graphics.setColor(Color.white);
                }
                else{graphics.setColor(Color.BLACK);}

                graphics.fillRect(j * size, i * size, size, size);

            }


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