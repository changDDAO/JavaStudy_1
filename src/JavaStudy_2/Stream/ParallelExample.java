package JavaStudy_2.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        //순차처리
        List<String> list = Arrays.asList("홍길동", "윤창호","김진아","람다식","박병렬");
        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print);
        //메소드 참조 (s->ParallelExample.print(s)와 동일
        System.out.println();

        //병렬처리

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(s->ParallelExample.print(s));



    }
    public static void print(String str){
        System.out.println(str+" : "+Thread.currentThread().getName());
    }

}
