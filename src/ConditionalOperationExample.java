import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalOperationExample {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String score = bufferedReader.readLine();
            int iScore = Integer.parseInt(score);
            char grade = (iScore>=90)?'A':(iScore>80)?'B':'C';
            System.out.println(score+"점은 "+ grade +"등급입니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
