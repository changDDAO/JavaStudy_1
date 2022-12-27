package JavaStudy_2.Stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("윤창호",98),new Student("김진아",99)
                ,new Student("김준선",74));

        double avg = studentList.stream()
                .mapToInt(Student::getScore)//중간처리(학생 객체를 점수로 매핑)
                .average()//최종처리
                .getAsDouble();
        System.out.println("평균 점수 : "+ avg);
    }
}
