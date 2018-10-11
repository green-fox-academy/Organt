import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing standUp = new Thing("Stand Up");
        standUp.complete();
        Thing eatLunch = new Thing("Eat lunch");
        eatLunch.complete();
        fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove the obstacles"));
        fleet.add(standUp);
        fleet.add(eatLunch);


        Collections.sort(fleet.things);





        System.out.println(fleet);
    }
}