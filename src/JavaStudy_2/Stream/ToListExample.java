package JavaStudy_2.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(new Student("윤창호",94,Student.Sex.MALE),
                new Student("김경석",37,Student.Sex.MALE),
        new Student("김진아",99,Student.Sex.FEMALE),
        new Student("윤종호",98,Student.Sex.MALE),
        new Student("장여진",100, Student.Sex.FEMALE));

        System.out.println("남자 리스트");
        List<Student> maleStudent = totalList.stream()
                .filter(s->s.getSex()== Student.Sex.MALE)
                .collect(Collectors.toList());
        maleStudent.stream()
                .forEach(s-> System.out.println(s.getName()) );

        System.out.println();
        System.out.println("여자 리스트");
        Set<Student> femaleList = totalList.stream()
                .filter(s->s.getSex()== Student.Sex.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));
        femaleList.stream()
                .forEach(s-> System.out.println(s.getName()));
    }
}
