package JavaStudy_1;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1==obj2){
            System.out.println("같은 singleton 객체입니다."+obj1.age);

        }else {
            System.out.println("다른 싱글톤 객체입니다."+obj2.age);
        }

    }
}
