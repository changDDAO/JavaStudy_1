package JavaStudy_2.FrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("JAVA");
        set.add("MyBatis");
        set.add("Servlet/JSP");
        set.add("JDBC");
        set.add("JAVA");

        int size = set.size();
        System.out.println("총 객체 수 : "+size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element =iterator.next();
            if(element.equals("JDBC"))
                iterator.remove();
            System.out.println("\t"+element);//iterator를 통해 출력을 했을 때 모두 출력되나, 실제로 HashSet에서는 JDBC는
            //삭제 되어있음.
        }
        set.remove("JDBC");
        set.remove("MyBatis");
        System.out.println("총 객체 수 : "+set.size());

        iterator= set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t"+element);
        }
        set.clear();

        if(set.isEmpty()){
            System.out.println("set이 비었습니다.");
        }
    }
}
