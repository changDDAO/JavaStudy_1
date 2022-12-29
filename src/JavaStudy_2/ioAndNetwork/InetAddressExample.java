package JavaStudy_2.ioAndNetwork;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("내 컴퓨터 IP 주소 : "+local);

        InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
        for(InetAddress remote : iaArr)
        System.out.println("www.naver.com의 IP주소 : "+remote.getHostAddress());

    }
}
