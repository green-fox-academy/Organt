package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircraft> aircrafts;
    int ammoStorage;
    int HP;

    public Carrier(int ammoStore, int HP) {
        aircrafts = new ArrayList<>();
        this.ammoStorage = ammoStore;
        this.HP = HP;
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void fill() {
        if (ammoStorage > 0) {
            for (Aircraft aircraft :
                    aircrafts) {
                if (ammoStorage > 0 && aircraft.isPriority()) {
                    ammoStorage = aircraft.refill(ammoStorage);
                }
                if (ammoStorage > 0 && !aircraft.isPriority()) {
                    ammoStorage = aircraft.refill(ammoStorage);
                }
            }
        }
        else {
            System.out.println("No ammo in the ammo storage..");
        }


    }

    public void fight(Carrier anotherCarrier) {
        for (Aircraft aircraft :
                aircrafts) {
            anotherCarrier.HP -= aircraft.fight();

        }
    }

    public void getStatus() {
        int totalDamage = 0;
        for (Aircraft aircraft :
                aircrafts) {
            totalDamage += aircraft.ammo * aircraft.baseDemage;
        }

        if (HP > 0) {
            System.out.println("HP : " + HP + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + ammoStorage + ", Total damage: " + totalDamage);
            for (Aircraft aircraft :
                    aircrafts) {
                System.out.println("Type " + aircraft.type + ", Ammo: " + aircraft.ammo + ", Base Damage: " + aircraft.baseDemage + ", All Demage: " + aircraft.ammo * aircraft.baseDemage);
                ;
            }
        } else System.out.println("It's dead Jim :(");
    }
}
