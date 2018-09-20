public class Bmi {
    public static void main(String[] args) {
        double massInKg = 71.2;
        double heightInM = 1.7;
        double square = Math.pow(heightInM, 2);

        double BMI = massInKg / square;
        System.out.println("Your BMI is " + BMI);
    }
}
