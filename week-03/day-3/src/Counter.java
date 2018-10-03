public class Counter {
    int Honzik;
    int initial;

    public Counter() {
        Honzik = 0;
        initial = 0;
    }

    public Counter(int Honzik) {
        this.Honzik = Honzik;
        this.initial = Honzik;
    }

    public void add() {
        Honzik += 1;
    }

    public void add(int number) {
        Honzik += number;
    }

    public int get() {
        return Honzik;
    }

    public void reset() {
        Honzik = initial;
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
