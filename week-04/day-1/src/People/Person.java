package People;

import java.util.ArrayList;

public class Person {
    String name;
    int age;
    String gender ;

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + ".");
    }
    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

//        Person mark = new Person("Mark", 46, "male");
//        people.add(mark);
//        Person jane = new Person();
//        people.add(jane);
//        Student john = new Student("John Doe", 20, "male", "BME");
//        people.add(john);
//        Student student = new Student();
//        people.add(student);
//        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
//        people.add(gandhi);
//        Mentor mentor = new Mentor();
//        people.add(mentor);
//        Sponsor sponsor = new Sponsor();
//        people.add(sponsor);
//        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
//        people.add(elon);
//
//        student.skipDays(3);
//
//        for (int i = 0; i < 5; i++) {
//            elon.hire();
//        }
//
//        for (int i = 0; i < 3; i++) {
//            sponsor.hire();
//        }
//
////        for(Person person : people) {
////            person.introduce();
////            person.getGoal();
////        }
//
//        Cohort awesome = new Cohort("AWESOME");
//        awesome.addStudent(student);
//        awesome.addStudent(john);
//        awesome.addMentor(mentor);
//        awesome.addMentor(gandhi);

        Student honzik = new Student("John", 20, "male", "BME");
        Student john = honzik.clone();


        System.out.println(john.name + john.age + john.gender + john.previousOrganization);
//        awesome.info();
    }
}
