package JavaStudy_2.ioAndNetwork;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Temp/file.txt");
        FileWriter fw = new FileWriter(file,true);
        fw.write("Filewriter는 한글로된 "+"\r\n");
        fw.write("문자열을 바로 출력할 수 있다."+"\r\n");
        fw.flush();
        fw.close();
        System.out.println("파일에 저장되었습니다.");


    }
}
