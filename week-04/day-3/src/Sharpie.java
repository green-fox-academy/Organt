public class Sharpie {
    String color;
    double width;
    double inkAmount;

    public Sharpie(String color, double width){
        this.color = color;
        this.width = width;
        this.inkAmount = 1;
    }

    public String use() {
        if (inkAmount > 0) {
            this.inkAmount -= 1;
            return "The amount of ink is now " + inkAmount;
        }
        else return "There is no ink";
    }


}
