import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args) {
        Week today =null;

        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

        switch (week){
            case 1:
                today =Week.SUNDAY;
                break;
            case 2:
                today =Week.MONDAY;
                break;
            case 3:
                today =Week.TUESDAY;
                break;
            case 4:
                today =Week.WEDNESDAY;
                break;
            case 5:
                today =Week.THURSDAY;
                break;
            case 6:
                today =Week.FRIDAY;
                break;
            case 7:
                today =Week.SATURDAY;
                break;
        }
        System.out.println("오늟 요일 : "+today);
        if(today ==Week.SUNDAY){
            System.out.println("오늘은 축구를 합니다");
        }else {
            System.out.println("오늘은 열심히 java를 공부합니다.");
        }

    }
}
