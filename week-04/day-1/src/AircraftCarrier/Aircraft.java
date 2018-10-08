package AircraftCarrier;

public class Aircraft {
    String type;
    int ammo;
    int baseDemage;
    int maxAmmo;

    public int fight() {
        int demage = baseDemage * ammo;
        ammo = 0;
        return demage;
    }

    public int refill(int anotherAmmo) {
        int remain = 0;
        if (maxAmmo - ammo > anotherAmmo) {
            ammo += anotherAmmo;
            return remain;
        }
        else {
            remain = anotherAmmo - (maxAmmo - ammo);
            ammo = maxAmmo;
            return remain;
        }
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type " + type + ", Ammo: " + ammo + ", Base Demage: " + baseDemage + ", All Demage: " + ammo * baseDemage;
    }

    public boolean isPriority() {
        if (type.equals("F35")) {
            return true;
        }
        else return false;
    }
}
