import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeCreateExample {
    public static void main(String[] args) throws InterruptedException{
        //날짜얻기
        LocalDate currDate = LocalDate.now();
        System.out.println("현재 날짜 : "+currDate);

        LocalDateTime currTime = LocalDateTime.now();
        System.out.println("현재 시간 : "+currTime);

    }
}
