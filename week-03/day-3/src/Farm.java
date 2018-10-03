import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals;
    int slots = 10;

    public Farm() {
        animals = new ArrayList<>();
        slots -= animals.size();
    }
    public void breed() {
        if (slots > 0) {
            animals.add(new Animal("new born animal"));
        }
    }
    public void slaughter() {
        int j = 0;
        for (int i = 1; i < animals.size(); i++) {
            if (animals.get(i).hunger > animals.get(j).hunger){
                j = i;
            }
        }
        animals.remove(j);
    }

    public static void main(String[] args) {


        Animal zebra = new Animal("zebra");
        zebra.play();
        zebra.play();
        zebra.play();
        zebra.play();

        Animal Honzik = new Animal("Honzik");
        Honzik.play();
        Honzik.play();
        Animal elephant = new Animal("elephant");
        Animal koala = new Animal("koala");
        koala.eat();
        koala.eat();


        Animal monkey = new Animal("monkey");
        Animal horse = new Animal("horse");
        horse.play();
        horse.play();
        horse.play();
        horse.play();
        horse.play();
        horse.play();


        Farm farm = new Farm();
        farm.animals.add(Honzik);
        farm.animals.add(zebra);
        farm.animals.add(koala);
        farm.animals.add(monkey);
        farm.animals.add(horse);

        farm.slaughter();

        for (Animal animal : farm.animals) {
            System.out.println(animal.name);
        }


    }

}
