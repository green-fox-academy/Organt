package main.java.animals;

public class Reptile extends Animal {

    public Reptile(String name) {
        super.name = name;
    }

    @Override
    public String breed() {
        return "lying eggs";
    }
}
