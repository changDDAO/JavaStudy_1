package JavaStudy_2.ioAndNetwork;

import java.io.InputStream;

public class SystemInExample2 {
    public static void main(String[] args) throws Exception{
        InputStream is =System.in;

        byte[] datas = new byte[100];
        System.out.print("이름: ");
        int nameBytes = is.read(datas);
        System.out.println("읽은 byte수 : "+nameBytes);
        String name = new String(datas,0,nameBytes-1);
        //책에는 2를 빼주라고 돼있으나 1을 뺴줘야 문자가 안깨지고 정상출력 개편된듯?
        System.out.print("하고 싶은말 : ");
        int commentBytes = is.read(datas);
        String comment = new String(datas,0,commentBytes-1);

        System.out.println("입력한 이름 : "+name);
        System.out.println("하고싶은 말 : "+comment);
    }
}
