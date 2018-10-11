package main.java.music;

import main.java.music.StringedInstrument;

public class Violin extends StringedInstrument {
    public Violin() {
        super.numberOfStrings = 4;
        super.name = "Violin";
    }

    public Violin(int numberOfStrings) {
        super.numberOfStrings = numberOfStrings;
        super.name = "Violin";
    }

    @Override
    String sound() {
        return "Screech";
    }

    @Override
    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }
}
