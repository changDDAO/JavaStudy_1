public class Singleton {
    int age = 10;
    private final static Singleton singleton = new Singleton();
    private Singleton(){}

    static Singleton getInstance(){
        return singleton;
    }
}
