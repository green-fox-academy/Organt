public class Animal {
    int hunger;
    int thirst;
    String name;

    public Animal(String name) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
    }
    public void eat() {
        this.hunger -= 1;
    }
    public void drink() {
        this.thirst -= 1;
    }
    public void play() {
        this.hunger += 1;
        this.thirst += 1;
    }

    public static void main(String[] args) {
        Animal animial = new Animal("new animal");
        animial.eat();
        animial.drink();
        System.out.println(animial.hunger + " " + animial.thirst);
    }
}
