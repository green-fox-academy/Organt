public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public Student() {
        super();
        previousOrganization = "Story of Life";
        skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganisation) {
        super(name, age, gender);
        this.previousOrganization = previousOrganisation;
        skippedDays = 0;
    }
    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer");
    }
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }
    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}
