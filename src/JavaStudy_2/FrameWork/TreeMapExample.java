package JavaStudy_2.FrameWork;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(84,"윤창호");
        scores.put(95,"윤지경");
        scores.put(89,"윤종호");
        scores.put(99,"장여진");
        scores.put(67,"김진아");

        Map.Entry<Integer, String> entry = null;
        entry = scores.firstEntry();
        System.out.println("가장 낮은 점수 : "+entry.getKey()+" 이름 : "+entry.getValue());

        entry = scores.lastEntry();
        System.out.println("가장 높은 점수 : "+entry.getKey()+" 이름 : "+entry.getValue());

        entry =scores.lowerEntry(95);
        System.out.println("95점 아래점수 : "+entry.getKey());

        entry = scores.higherEntry(84);
        System.out.println("84점 위에점수 : "+entry.getKey());

        entry = scores.floorEntry(95);
        System.out.println("95점이거나 바로 아래점수 : "+entry.getKey());

        while(!scores.isEmpty()){
            entry = scores.pollLastEntry();
            System.out.println(entry.getKey()+"-"+entry.getValue()+"남은 객체 수 : "+scores.size());

        }


    }
}
