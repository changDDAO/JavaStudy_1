package JavaStudy_2.Stream;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr ={1,2,3,4,5};
        System.out.println("peek()를 마지막에 호출한 경우");
        Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(a-> System.out.println(a));//console에 출력안됨.

        System.out.println("최종 처리 메소드를 마지막에 호출한 경우");
        int sum = Arrays.stream(intArr)
                .filter(a->a%2==0)
                .peek(a-> System.out.println(a))
                .sum();
        System.out.println("총합 : "+sum);
        System.out.println();

        System.out.println("[forEach()를 마지막에 호출한 경우]");
        Arrays.stream(intArr)
                .filter(n->n%2==0)
                .forEach(n-> System.out.println(n));
    }
}
