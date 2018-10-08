package AircraftCarrier;

public class Battlefield {
    public static void main(String[] args) {
        F16 aircraft1 = new F16();
        F35 aircraft2 = new F35();
        F16 aircraft3 = new F16();
        F35 aircraft4 = new F35();
        F16 aircraft5 = new F16();
        F35 aircraft6 = new F35();

        Carrier carrier = new Carrier(0, 5000);
        carrier.add(aircraft1);
        carrier.add(aircraft2);
        carrier.add(aircraft3);
        carrier.add(aircraft4);
        carrier.add(aircraft5);
        carrier.add(aircraft6);

        F16 enemy1 = new F16();
        F35 enemy2 = new F35();
        F16 enemy3 = new F16();
        F16 enemy4 = new F16();
        F16 enemy5 = new F16();
        F35 enemy6 = new F35();

        Carrier enemyCarrier = new Carrier(2000, 2000);
        enemyCarrier.add(enemy1);
        enemyCarrier.add(enemy2);
        enemyCarrier.add(enemy3);
        enemyCarrier.add(enemy4);
        enemyCarrier.add(enemy5);
        enemyCarrier.add(enemy6);



        carrier.getStatus();
        System.out.println();
        enemyCarrier.getStatus();
        carrier.fill();
        carrier.fight(enemyCarrier);
        System.out.println();
        carrier.getStatus();
        System.out.println();
        enemyCarrier.getStatus();
    }
}
