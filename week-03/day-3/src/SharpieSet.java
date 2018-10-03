import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies;

    public SharpieSet(){
        sharpies = new ArrayList<>();
    }
    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie: sharpies) {
            if (sharpie.inkAmount != 0){
                count++;
            }
        }
        return count;
    }
    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0) {
                sharpies.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Sharpie sharpie1 = new Sharpie("sdf", 2);
        sharpie1.use();
        Sharpie sharpie2 = new Sharpie("sd", 3);
        Sharpie sharpie3 = new Sharpie("sdf", 4);
        Sharpie sharpie4 = new Sharpie("sdf", 0);

        SharpieSet sharpieSet = new SharpieSet();
        sharpieSet.sharpies.add(sharpie1);
        sharpieSet.sharpies.add(sharpie2);
        sharpieSet.sharpies.add(sharpie3);
        sharpieSet.sharpies.add(sharpie4);

        System.out.println(sharpieSet.sharpies.size());
        System.out.println(sharpieSet.countUsable());
        sharpieSet.removeTrash();
        System.out.println(sharpieSet.sharpies.size());
        System.out.println(sharpieSet.countUsable());



    }
}
