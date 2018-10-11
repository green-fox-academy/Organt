/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing> {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing t) {
        if ((completed && t.completed) || (!completed && !t.completed)) {
            return name.compareTo(t.name);
        }
        else if (!completed && t.completed) {
            return 1;
        }
        else return -1;
    }
}