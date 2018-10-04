import java.awt.*;

public class DrawCircle {
    public static void circleFromCenter(Graphics graphics, double x, double y, double r) {
        x = x - r / 2;
        y = y - r / 2;
        graphics.setColor(RandomColor.getColor());
        graphics.fillOval((int) x, (int) y, (int) r, (int) r);
    }
}
