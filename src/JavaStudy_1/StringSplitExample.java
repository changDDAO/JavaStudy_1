package JavaStudy_1;

import java.util.StringTokenizer;

public class StringSplitExample {
    public static void main(String[] args) {
        String text= "홍길동&이수홍,박연수,김자바-최명호";
        String[] names =text.split("&|-|,");
        for(String name :names){
            System.out.println("name = " + name);
        }
        String text2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(text2,"/");
        while(st.hasMoreTokens()) {
            String name = st.nextToken();
            System.out.println("name = " + name);
        }
    }
}
