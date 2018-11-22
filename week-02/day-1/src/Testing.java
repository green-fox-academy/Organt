import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Testing {
    public static void main(String[] args) {
        String dateTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));

        System.out.println(dateTime);
    }
}
