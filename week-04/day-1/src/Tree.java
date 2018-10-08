public class Tree {
    double waterAmount;
    String color;

    public Tree(String color) {
        this.color = color;
        waterAmount = 0;
        status();
    }

    public void status(){
        if (waterAmount < 10) {
            System.out.println("The " + color + " Tree needs water");
        }
        else System.out.println("The " + color + " Tree doesn't need water");
    }

    public void watering (double water) {
        waterAmount += water * 0.4;
    }
}
