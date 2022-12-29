package JavaStudy_2.ioAndNetwork;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws IOException {
        long start =0;
        long end =0;

        FileInputStream fis1 = new FileInputStream("C:/Temp/target.jpg");
        start = System.currentTimeMillis();
        while(fis1.read()!=-1){}
        end = System.currentTimeMillis();
        System.out.println("Buffer를 사용하지 않았을 때 : "+ (end-start)+"ms");
        fis1.close();

        FileInputStream fis2 = new FileInputStream("C:/Temp/target.jpg");
        BufferedInputStream bis =new BufferedInputStream(fis2);
        start = System.currentTimeMillis();
        while(bis.read()!=-1){}
        end = System.currentTimeMillis();
        System.out.println("Buffer를 사용하였을 때 : "+(end-start)+"ms");
        //생각보다 엄청난 차이를 보인다!
    }
}
