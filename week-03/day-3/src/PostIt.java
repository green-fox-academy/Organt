public class PostIt {
    String backgroundColor;
    String text;
    String textColor;


    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public static void main(String[] args) {
        PostIt firstObject = new PostIt("orange", "Idea 1", "blue");
        PostIt secondObject = new PostIt("pink", "Awesome", "black");
        PostIt thirdObject = new PostIt("yellow", "Superb!", "green");


    }
}
