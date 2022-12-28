package JavaStudy_2.ioAndNetwork;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {
        InputStream is =System.in;
        Reader reader =new InputStreamReader(is);

        int readCharNo;
        char[] cBuf = new char[100];
        while((readCharNo=reader.read(cBuf))!=-1){
            String data = new String(cBuf,0,readCharNo);
            System.out.println(data);
        }
        reader.close();

    }
}
