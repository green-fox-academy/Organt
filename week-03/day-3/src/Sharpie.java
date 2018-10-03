public class Sharpie {
    String color;
    double width;
    double inkAmount;

    public Sharpie(String color, double width){
        this.color = color;
        this.width = width;
        this.inkAmount = 1;
    }
    public void use() {
        this.inkAmount -= 1;
    }

    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("blue", 50);
        sharpie.use();
        System.out.println(sharpie.inkAmount + " " + sharpie.color);
    }
}
