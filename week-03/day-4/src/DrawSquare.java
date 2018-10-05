import java.awt.*;

public class DrawSquare {
    public static void centerdSquare(Graphics graphics, double x, double y, double a) {
        graphics.setColor(RandomColor.getColor());
        graphics.fillRect((int)(x - a / 2), (int)(y - a / 2), (int)a, (int)a);
    }
    public static void centeredBorderSquare(Graphics graphics, double x, double y, double a, int count){
        graphics.setColor(RandomColor.getColor());
        for (int i =  - 8 / count; i <= 8 / count; i++) {
            graphics.drawRect((int) (x - a / 2 - i), (int) (y - a / 2 - i), (int) (a + 2 * i), (int) (a + 2 * i));
        }
    }


    }
