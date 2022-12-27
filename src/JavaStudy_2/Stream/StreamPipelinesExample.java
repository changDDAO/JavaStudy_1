package JavaStudy_2.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(new Member("홍길동",Member.MALE,30),new Member("홍길동",Member.MALE,30),
        new Member("윤창호",Member.MALE,28),
        new Member("김진아",Member.FEMALE,28),
        new Member("김경석",Member.MALE,26));

        double ageAvg = list.stream().filter(member -> member.getSex()==Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println("남자 평균 나이 : "+ageAvg);


    }
}
