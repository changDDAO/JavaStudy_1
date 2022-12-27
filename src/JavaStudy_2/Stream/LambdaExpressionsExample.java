package JavaStudy_2.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsExample
{
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("홍길동",92),new Student("윤창호",93));
        Stream<Student> stream =list.stream();
        stream.forEach(s->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name+"-"+score);
        });

    }
}
