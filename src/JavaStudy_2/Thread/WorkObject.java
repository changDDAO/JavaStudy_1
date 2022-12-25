package JavaStudy_2.Thread;

public class WorkObject {
    public synchronized void methodOne(){
        System.out.println("ThreadOne의 methodOne 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public synchronized void methodTwo(){
        System.out.println("ThreadTwo의 methodTwo 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
