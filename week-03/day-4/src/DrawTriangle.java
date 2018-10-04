import java.awt.*;

public class DrawTriangle {
    public static void fromTop(Graphics graphics, double x1, double y1, double a) {
        int[] x = {(int)x1,  (int)(x1 + a /2), (int)(x1 - a / 2)};
        int[] y = {(int)y1, (int)(y1 + h(a)), (int)(y1 + h(a))};

        graphics.setColor(RandomColor.getColor());
        graphics.fillPolygon(x, y, 3);
    }


    public static double h(double a) {
        double h = a * (Math.sqrt(3) / 2);
        return h;
    }
}
