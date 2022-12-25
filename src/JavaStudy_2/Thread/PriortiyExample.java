package JavaStudy_2.Thread;

public class PriortiyExample {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
        Thread thread = new CalcThread("thread"+i);
        if(i!=10){
            thread.setPriority(Thread.MIN_PRIORITY);
        }else {
            thread.setPriority(Thread.MAX_PRIORITY);
        }
        thread.start();
        //여러번 실행해보았지만 컴퓨터 성능이 좋아져서 그런지 thread10의 경우 MAX_PRIORITY를 가졌음에도
            // 1~5순위 왔다갔다함.
        }
    }
}
