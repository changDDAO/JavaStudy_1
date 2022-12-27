package JavaStudy_2.FrameWork;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
//        TreeSet<Fruit> treeSet = new TreeSet<>();
//        treeSet.add(new Fruit("사과",3000));
//        treeSet.add(new Fruit("바나나",2000));
//        treeSet.add(new Fruit("배",5000));
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
        treeSet.add(new Fruit("사과",3000));
        treeSet.add(new Fruit("바나나",2000));
        treeSet.add(new Fruit("배",5000));
        Iterator<Fruit> fruitIterator = treeSet.iterator();
        while (fruitIterator.hasNext()){
            Fruit fruit = fruitIterator.next();
            System.out.println(fruit.name+" "+fruit.price);
        }


    }
}
