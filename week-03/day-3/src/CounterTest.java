import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CounterTest {

    Counter c = new Counter();

    @Test
    void addMore() {
        c.add(5);
        assertEquals(5, c.get());
    }

    @Test
    void addOne() {
        c.add();
        assertEquals(1, c.get());
    }

    @Test
    void getZero() {
        assertEquals(0, c.get());
    }

    @Test
    void getInit() {
        Counter c = new Counter(7);
        assertEquals(7, c.get());
    }

    @Test
    void resetToZero() {
        c.add();
        c.reset();
        assertEquals(0, c.get());
    }

    @Test
    void resetToInit() {
        Counter c = new Counter(7);
        c.add(5);
        c.reset();
        assertEquals(7, c.get());
    }

    public static void main(String[] args) {
        Counter counter = new Counter(40);
        counter.add();
        counter.add(30);
        System.out.println(counter.get());
        counter.reset();
        System.out.println(counter.get());
    }
}