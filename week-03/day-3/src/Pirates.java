public class Pirates {
    String name;
    boolean alive;
    int intoxication;
    boolean sleeping;

    public Pirates(String name){
        this.name = name;
        alive = true;
        sleeping = false;
        intoxication = 0;
    }
    public void drinkSomeRum(){
        if (alive){
            intoxication++;
        }
        else System.out.println("he's dead");
    }
    public void howsItGoingMate() {
        if (!alive) {
            System.out.println("he's dead");
        }
        else if (intoxication < 5) {
            System.out.println("Pour me anudder!");
        }
        else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            sleeping = true;
        }
    }
    public void die() {
        alive = false;
    }
    public void brawl(Pirates anotherPirate) {
        int result = (int)(Math.random()*3);
        if (result == 0) {
            alive = false;
        }
        if (result == 1){
            anotherPirate.alive = false;
        }
        if (result == 2) {
            sleeping = true;
            anotherPirate.sleeping = true;
        }
    }

    public static void main(String[] args) {
        Pirates Jack = new Pirates("Jack");
        Pirates BlackBeard = new Pirates("BlackBeard");
        Jack.brawl(BlackBeard);
        Jack.drinkSomeRum();
        Jack.drinkSomeRum();
        Jack.drinkSomeRum();
        Jack.drinkSomeRum();
        Jack.drinkSomeRum();
        Jack.drinkSomeRum();

        Jack.howsItGoingMate();
        System.out.println(Jack.alive);
        System.out.println(BlackBeard.alive);
    }
}
