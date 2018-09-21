public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int day = 24 * 3600;
        int remains = day - (currentHours*3600 + currentMinutes*60 + currentSeconds);
        System.out.println(remains);
    }
}
