package JavaStudy_2.Thread;

public class ThreadTwo extends Thread{
    private WorkObject workObject;

    public ThreadTwo(WorkObject workObject){
        this.workObject = workObject;
    }
    @Override
    public void run(){
        for(int i=0; i<10;i++){
            workObject.methodTwo();
        }

    }
}
