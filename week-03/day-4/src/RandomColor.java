import java.awt.*;

public class RandomColor {

    public static Color getColor() {
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        return new Color(r, g, b);
    }
}
