package JavaStudy_2.FrameWork;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(94);
        scores.add(33);
        scores.add(49);
        scores.add(93);
        scores.add(89);

        NavigableSet<Integer> descendingSet = scores.descendingSet();
        for(Integer score:descendingSet){
            System.out.print(score+" ");
        }
        System.out.println();
        NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
        for(Integer score:ascendingSet)
        System.out.print(score+" ");



    }
}
