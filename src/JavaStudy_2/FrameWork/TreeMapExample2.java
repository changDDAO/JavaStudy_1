package JavaStudy_2.FrameWork;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> scores = new TreeMap<>();
        scores.put(3,"윤");
        scores.put(1,"김");
        scores.put(9,"박");
        scores.put(7,"나");
        scores.put(6,"임");
        scores.put(5,"노");
        NavigableMap<Integer, String> descendingMap = scores.descendingMap();
        Set<Map.Entry<Integer,String>> descendingSet = descendingMap.entrySet();
        for(Map.Entry<Integer, String> entry : descendingSet){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        System.out.println();

        NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
        Set<Map.Entry<Integer,String>> ascendingEntrySet = ascendingMap.entrySet();
        for(Map.Entry<Integer,String> entry:ascendingEntrySet){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }



    }
}
