package JavaStudy_2.FrameWork;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("윤창호",48));
        treeSet.add(new Person("김진아",27));
        treeSet.add(new Person("윤종호",28));
        treeSet.add(new Person("윤지경",35));
        treeSet.add(new Person("장여진",61));

        Iterator<Person> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Person person = iterator.next();
            System.out.println("Person의 이름 : "+person.name+"----Person의 나이 : "+person.age);
        }

    }
}
