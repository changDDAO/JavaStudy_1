package JavaStudy_2.Stream;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("윤창호","윤창호","윤창호","윤종호","김진아","김진아","김또깡");
        names.stream().distinct()
                .forEach(n-> System.out.println(n+" "));
        System.out.println();

        names.stream().filter(n->n.startsWith("김"))
                .forEach(n-> System.out.println(n+" "));
        System.out.println();

        names.stream().distinct().filter(n->n.startsWith("김"))
                .forEach(n-> System.out.println(n+" "));
    }
}
