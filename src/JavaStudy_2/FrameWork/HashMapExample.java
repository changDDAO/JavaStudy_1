package JavaStudy_2.FrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("윤창호",95);
        map.put("김진아",94);
        map.put("윤종호",96);
        map.put("홍길동",34);
        System.out.println("총 Entry 수 : "+ map.size());

        System.out.println("홍길동 점수 : "+map.get("홍길동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer score = map.get(key);
            System.out.println("key : "+key+" score : "+score);

        }
        map.remove("홍길동");
        System.out.println("총 Entry 수 : "+map.size());
        Set<Map.Entry<String,Integer>> entrySet =map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String key =entry.getKey();
            Integer score = entry.getValue();
            System.out.println("key : "+key+"  score : "+score);

        }
        System.out.println();
        map.clear();
        System.out.println("총 Entry 수 : "+map.size());

    }
}
