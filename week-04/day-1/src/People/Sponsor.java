package People;

public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor() {
        company = "Google";
        hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        hiredStudents = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far");
    }

    @Override
    public void getGoal () {
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire() {
        hiredStudents++;
    }
}
