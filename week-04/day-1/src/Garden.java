import java.util.ArrayList;

public class Garden {
    ArrayList<Tree> trees = new ArrayList<>();
    ArrayList<Flower> flowers = new ArrayList<>();

    public void watering(int waterAmount) {
        System.out.println("Watering with " + waterAmount);
        double water = waterAmount / (trees.size()) + (flowers.size());
        for (Flower flower:
                flowers) {
            flower.watering(water);
            flower.status();
        }
        for (Tree tree:
             trees) {
            tree.watering(water);
            tree.status();
        }
    }

    public static void main(String[] args) {
        Garden garden = new Garden();
        Flower flower1 = new Flower("yellow");
        garden.flowers.add(flower1);
        Flower flowr2 = new Flower("blue");
        garden.flowers.add(flowr2);
        Tree tree1 = new Tree("purple");
        garden.trees.add(tree1);
        Tree tree2 = new Tree("orange");
        garden.trees.add(tree2);

        System.out.println();
        garden.watering(40);
        System.out.println();System.out.println();
        garden.watering(70);
    }
}
