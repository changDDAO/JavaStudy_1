package JavaStudy_2.Thread;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();

        ThreadOne threadOne = new ThreadOne(sharedObject);
        ThreadTwo threadTwo = new ThreadTwo(sharedObject);

        threadOne.start();
        threadTwo.start();

    }
}
