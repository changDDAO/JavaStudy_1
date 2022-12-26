package JavaStudy_2.FrameWork;

import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(Integer.valueOf(40));
        scores.add(Integer.valueOf(70));
        scores.add(Integer.valueOf(95));
        scores.add(Integer.valueOf(39));
        scores.add(Integer.valueOf(67));

        Integer score = null;

        score = scores.first();
        System.out.println("가장 낮은 점수 : "+score);
        System.out.println();

        score = scores.last();
        System.out.println("가장 높은 점수 : "+score);

        score = scores.lower(Integer.valueOf(95));
        System.out.println("95점 바로 아래 점수 : "+score);

        score = scores.higher(Integer.valueOf(69));
        System.out.println("69점 바로 위에 점수 : "+score);
        
        score = scores.ceiling(95);
        System.out.println("95이랑 같거나 바로 위의 점수 : " + score);

        while(!scores.isEmpty()){
            score =scores.pollFirst();
            System.out.println("뽑힌 점수 : "+score+ " (남은 객체 수 : "+scores.size()+")");
        }
    }
}
