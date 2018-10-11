package main.java.animals;

abstract public class Animal {
    String name, gender;
    int age;

    public String getName() {
        return name;
    }

    abstract String breed();
}
