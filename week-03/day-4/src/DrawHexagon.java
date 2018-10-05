import java.awt.*;

public class DrawHexagon {
    public static void fromCenter(Graphics graphics, double x, double y, double a) {
            x = x - a / 2;
            y = y - h(a) / 2;
            int[] xs = {(int)x, (int)(x + a), (int)(x + a + a / 2), (int)(x + a), (int)(x), (int)(x - a / 2)};
            int[] ys = {(int)y, (int)y, (int)(y + h(a) / 2), (int)(y + h(a)), (int)(y +  h(a)), (int)(y + h(a) / 2)};
            graphics.setColor(RandomColor.getColor());
            graphics.fillPolygon(xs, ys, 6);
        }
    public static double h(double a) {
        double h = 2 * a * (Math.sqrt(3) / 2);
        return h;
    }

}
