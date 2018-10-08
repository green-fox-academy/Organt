package Garden;

public class Flower {
    double waterAmount;
    String color;

    public Flower(String color) {
        this.color = color;
        waterAmount = 0;
        status();
    }

    public void status(){
        if (waterAmount < 5) {
            System.out.println("The " + color + " Garden.Flower needs water");
        }
        else System.out.println("The " + color + " Garden.Flower doesn't need water");
    }

    public void watering (double water) {
        waterAmount += water * 0.75;
    }

    public boolean needsWater() {
        return (waterAmount < 5);
    }
}
