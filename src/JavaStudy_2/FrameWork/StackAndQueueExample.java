package JavaStudy_2.FrameWork;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<Coin>();
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(10));
        coinBox.push(new Coin(100));

        while(!coinBox.isEmpty()){
            Coin coin = coinBox.pop();
            System.out.println("뽑힌 동전은 : "+coin.getValue());
        }

        Queue<Message> messageQueue = new LinkedList<Message>();
        messageQueue.offer(new Message("sendEmail","홍길동"));
        messageQueue.offer(new Message("sendSMS","윤창호"));
        messageQueue.offer(new Message("sendKakaotalk","김진아"));

        while(!messageQueue.isEmpty()){
            Message message= messageQueue.poll();
            switch(message.command){
                case "sendEmail":
                    System.out.println(message.to+"에게 메시지를 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to+"에게 메시지를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to+"에게 메시지를 보냅니다.");
                    break;

            }
        }

    }
}
