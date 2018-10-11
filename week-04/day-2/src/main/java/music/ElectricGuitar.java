package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        super.numberOfStrings = 6;
        super.name = "Eletric Guitar";
    }

    public ElectricGuitar(int numberOfStrings) {
        super.name = "Eletric Guitar";
        super.numberOfStrings = numberOfStrings;
    }

    @Override
    String sound() {
        return "Twang";
    }

    @Override
    public void play() {
        System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
    }
}
