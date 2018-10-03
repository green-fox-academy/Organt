public class Student {
    String knowledge;
    public void learn(){
        knowledge = "In 1620";
    }
    public void question(Teacher teacher) {
        teacher.answer();
        System.out.println("When did WWI started? " + teacher.response);
    }
}
