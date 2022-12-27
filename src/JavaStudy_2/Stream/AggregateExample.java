package JavaStudy_2.Stream;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        long count = Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("intArr의 2의 배수의 갯수는 : " + count);
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        long sum = Arrays.stream(intArr)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("2의 배수의 합은 : " + sum);

        double avg = Arrays.stream(intArr)
                .average()
                .getAsDouble();
        System.out.println("intArr 배열의 전체 element 평균값은 : " + avg);

        int max = Arrays.stream(intArr)
                .max()
                .getAsInt();
        System.out.println("intArr의 최댓값은 : "+max);

        int min = Arrays.stream(intArr)
                .filter(n->n%2==0)
                .min()
                .getAsInt();
        System.out.println("2의 배수중 최솟값은 : "+min);

        int first = Arrays.stream(intArr)
                .filter(n->n%3==0)
                .findFirst()
                .getAsInt();
        System.out.println("3의배수중 첫번째 값은 : "+first);

    }
}
