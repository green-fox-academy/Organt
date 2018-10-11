import java.util.List;

public class Sum {
    List<Integer> list;

    public Sum() {
    }

    public int sumAll(List<Integer> list) {
        int sum = 0;
        for (Integer number:
             list) {
            sum += number;
        }
        return sum;
    }
}
