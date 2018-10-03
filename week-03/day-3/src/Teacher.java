public class Teacher {
    String response;
    public void answer(){
        response = "In 1945";
    }
    public void teach(Student student) {
        student.learn();
        System.out.println("When was Bitva na Bile Hore? " + student.knowledge);
    }
}
