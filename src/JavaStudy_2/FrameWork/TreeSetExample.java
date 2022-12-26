package JavaStudy_2.FrameWork;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("kimchi");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("guess");
        treeSet.add("cherry");
        treeSet.add("base");

        System.out.println("c~f사이의 단어 검색");
        NavigableSet<String> subSet = treeSet.subSet("c",true,"f",true);
        for(String element:subSet){
            System.out.println(element+" ");
        }

    }
}
