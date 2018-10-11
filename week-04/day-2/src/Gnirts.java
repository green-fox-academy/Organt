public class Gnirts implements CharSequence{
    String name;

    public Gnirts() {
    }

    Gnirts(String name) {
        this.name = name;
    }


    @Override
    public int length() {
        return name.length();
    }

    @Override
    public char charAt(int index) {
        return name.charAt(name.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String s = "";
        for (int i = 0; i < end - start; i++) {
        s += name.charAt(name.length() - start -1 - i);
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "example";
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.subSequence(2, 5));

        System.out.println();

        Gnirts gnirts = new Gnirts("example");
        System.out.println(gnirts.length());
        System.out.println(gnirts.charAt(1));
        System.out.println(gnirts.subSequence(2, 5));

        System.out.println();

        Shifter shifter = new Shifter("example", 2);
        System.out.println(shifter.charAt(0));
    }
}
