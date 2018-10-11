import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    Animal animal = new Animal("Monkey");
    @Test
    public void eat() {
        for (int i = 0; i < 55; i++) {
            animal.eat();
        }
        assertEquals(0, animal.hunger);
    }

    @Test
    public void drink() {
        for (int i = 0; i < 55; i++) {
            animal.drink();
        }
        assertEquals(0, animal.thirst);
    }

    @Test
    public void play() {
        for (int i = 0; i < 55; i++) {
            animal.play();
        }
        assertEquals(0, animal.hunger);
        assertEquals(0, animal.thirst);
    }
}