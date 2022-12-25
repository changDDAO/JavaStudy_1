package JavaStudy_2.Thread;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try {
            sumThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("1부터 100까지의 합은 : "+sumThread.getSum());
    }
}
