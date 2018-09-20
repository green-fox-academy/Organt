public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        double e = 8;
        e = Math.pow(e, 3);
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean bigger = f1 > f2;
        System.out.println(bigger);

        int g1 = 350;
        int g2 = 200;
        boolean big = g2 * g2 > g1;
        System.out.println(big);

        int h = 135798745;
        boolean divisor = h % 11 == 0;
        System.out.println(divisor);

        int i1 = 10;
        int i2 = 3;
        boolean fuck = (i1 > Math.pow(i2, 2)) && (i1 < Math.pow(i2, 3));
        System.out.println(fuck);

        int j = 1521;
        boolean fuckj = (j % 5 == 0) || (j % 3 == 0);
        System.out.println(fuckj);

        String k = "Apple";
        for (int m = 1; m < 5; m++) {
            k += "Apple";
        }

        System.out.println(k);
    }
}
