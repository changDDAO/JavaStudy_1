package JavaStudy_2.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5,7,9,8,6});
        intStream.sorted()
                .forEach(num-> System.out.print(num+","));
        System.out.println();

        List<Student> studentList =Arrays.asList(new Student("윤창호",96),
                new Student("김진아",91),
                new Student("윤경석",83));
        studentList.stream()
                .sorted()
                .forEach(s-> System.out.print(s.getScore()+","));

        System.out.println();

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(student -> System.out.print(student.getScore()+","));
    }
}
