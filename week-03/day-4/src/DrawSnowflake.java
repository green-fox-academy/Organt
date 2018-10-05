import java.awt.*;
import java.lang.reflect.Array;

public class DrawSnowflake {
    double x;
    double y;
    double a;

    public DrawSnowflake(double x, double y, double a){
        this.x = x;
        this.y = y;
        this.a = a;
    }

    public  void snowLine (Graphics graphics) {
        snowTriangle(graphics);
        snowTip(graphics);
        snowTriangle(graphics);
        snowTriangleLeft(graphics);
        snowTipLeft(graphics);
        snowTip(graphics);
        snowTipRight(graphics);
        snowTriangleRight(graphics);
        snowTriangle(graphics);
        snowTip(graphics);
        snowTriangle(graphics);

    }
    public void snowTip(Graphics graphics){
        double[][] coordinates = new double[9][2];
        coordinates[0][0] = x;
        coordinates[0][1] = y;
        coordinates[1][0] = x + a / 2;
        coordinates[1][1] = y - heightOfTriangle();
        coordinates[2][0] = x;
        coordinates[2][1] = y - 2 * heightOfTriangle();
        coordinates[3][0] = x + a;
        coordinates[3][1] = coordinates[2][1] ;
        coordinates[4][0] = coordinates[3][0] + a / 2;
        coordinates[4][1] = coordinates[3][1] - heightOfTriangle();
        coordinates[5][0] = coordinates[4][0] + a / 2;
        coordinates[5][1] = coordinates[3][1] ;
        coordinates[6][0] = coordinates[5][0]+ a;
        coordinates[6][1] = coordinates[5][1] ;
        coordinates[7][0] = coordinates[6][0] - a / 2;
        coordinates[7][1] = coordinates[6][1] + heightOfTriangle();
        coordinates[8][0] = coordinates[7][0] + a / 2;
        coordinates[8][1] = y;

        for (int i = 0; i < coordinates.length - 1; i++) {
            graphics.drawLine((int)coordinates[i][0], (int)coordinates[i][1], (int)coordinates[i+1][0], (int)coordinates[i + 1][1]);
        }
        x += 3 * a;

    }
    public void snowTipLeft(Graphics graphics){
        double[][] coordinates = new double[9][2];
        coordinates[0][0] = x;
        coordinates[0][1] = y;
        coordinates[1][0] = x - a / 2;
        coordinates[1][1] = y - heightOfTriangle();
        coordinates[2][0] = x - a /2 - a;
        coordinates[2][1] = y - heightOfTriangle();
        coordinates[3][0] = x - a;
        coordinates[3][1] = coordinates[2][1] -  heightOfTriangle();
        coordinates[4][0] = coordinates[2][0];
        coordinates[4][1] = coordinates[3][1] - heightOfTriangle();
        coordinates[5][0] = coordinates[4][0] + a;
        coordinates[5][1] = coordinates[4][1];
        coordinates[6][0] = coordinates[5][0]+ a / 2;
        coordinates[6][1] = coordinates[5][1] - heightOfTriangle();
        coordinates[7][0] = coordinates[6][0] + a / 2;
        coordinates[7][1] = coordinates[5][1];
        coordinates[8][0] = coordinates[7][0] + a;
        coordinates[8][1] = coordinates[7][1];

        for (int i = 0; i < coordinates.length - 1; i++) {
            graphics.drawLine((int)coordinates[i][0], (int)coordinates[i][1], (int)coordinates[i+1][0], (int)coordinates[i + 1][1]);
        }
        x += a + a / 2;
        y -= 3 * heightOfTriangle();

    }
    public void snowTipRight(Graphics graphics){
        double[][] coordinates = new double[9][2];
        coordinates[0][0] = x;
        coordinates[0][1] = y;
        coordinates[1][0] = x + a;
        coordinates[1][1] = y;
        coordinates[2][0] = x +a + a / 2;
        coordinates[2][1] = y -  heightOfTriangle();
        coordinates[3][0] = coordinates[2][0] + a / 2;
        coordinates[3][1] = y ;
        coordinates[4][0] = coordinates[3][0] + a;
        coordinates[4][1] = y;
        coordinates[5][0] = coordinates[4][0] - a / 2;
        coordinates[5][1] = coordinates[4][1] + heightOfTriangle();
        coordinates[6][0] = coordinates[5][0]+ a / 2;
        coordinates[6][1] = coordinates[5][1] + heightOfTriangle() ;
        coordinates[7][0] = coordinates[6][0] - a;
        coordinates[7][1] = coordinates[6][1];
        coordinates[8][0] = coordinates[7][0] - a / 2;
        coordinates[8][1] = coordinates[7][1] + heightOfTriangle();

        for (int i = 0; i < coordinates.length - 1; i++) {
            graphics.drawLine((int)coordinates[i][0], (int)coordinates[i][1], (int)coordinates[i+1][0], (int)coordinates[i + 1][1]);
        }
        x += a + a /2;
        y += 3 * heightOfTriangle();
    }
    public void snowTriangle(Graphics graphics) {
        graphics.drawLine((int) x, (int)y, (int)(x + a),(int) y);
        graphics.drawLine((int)(x + a),(int) y, (int)(x + a + a / 2), (int)(y -heightOfTriangle()));
        graphics.drawLine((int)(x + a + a / 2), (int)(y -heightOfTriangle()), (int)(x + 2 * a), (int)y);
        graphics.drawLine((int)(x + 2 * a), (int)y, (int)(x + 3 * a), (int)y);
        x += + 3 * a;
    }
    public void snowTriangleLeft(Graphics graphics) {
        graphics.drawLine((int)x, (int)y, (int)(x + a / 2),(int) (y - heightOfTriangle()));
        graphics.drawLine((int)(x + a / 2),(int) (y - heightOfTriangle()), (int)x, (int)(y - 2 * heightOfTriangle()));
        graphics.drawLine((int)x, (int)(y - 2 * heightOfTriangle()), (int)(x + a), (int)(y - 2 * heightOfTriangle()));
        graphics.drawLine((int)(x + a), (int)(y - 2 * heightOfTriangle()), (int)(x + a + a / 2), (int)(y - 3 * heightOfTriangle()));
        x = x + a + a / 2;
        y = y - 3 * heightOfTriangle();
    }
    public void snowTriangleRight(Graphics graphics) {
        graphics.drawLine((int)x, (int)y, (int)(x + a / 2),(int) (y + heightOfTriangle()));
        graphics.drawLine((int)(x + a / 2),(int) (y + heightOfTriangle()), (int)(x + a * 3 / 2), (int)(y+ heightOfTriangle()));
        graphics.drawLine((int)(x + a * 3 / 2), (int)(y+ heightOfTriangle()), (int)(x + a), (int)(y + 2 * heightOfTriangle()));
        graphics.drawLine((int)(x + a), (int)(y + 2 * heightOfTriangle()), (int)(x + a * 3 / 2), (int)(y + heightOfTriangle() * 3));
        x += a + a / 2;
        y += 3* heightOfTriangle();
    }




    public double heightOfTriangle() {
        double h = a * (Math.sqrt(3) / 2);
        return h;
    }

}
