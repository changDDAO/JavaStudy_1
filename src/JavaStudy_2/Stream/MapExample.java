package JavaStudy_2.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        List<Student> stdList = Arrays.asList(
                new Student("윤창호",98),
                new Student("김진아",95),
                new Student("윤종호",88));

        stdList.stream()
                .mapToInt(Student::getScore)
                .forEach(score-> System.out.println(score));
        System.out.println();
    int [] intArray ={1,2,3,4,5};
    IntStream intStream =Arrays.stream(intArray);
    intStream.asDoubleStream()
            .forEach(num-> System.out.println(num));
        System.out.println();

        intStream =Arrays.stream(intArray);
        intStream.boxed()
                .forEach((obj-> System.out.println(obj.intValue())));
    }

}
