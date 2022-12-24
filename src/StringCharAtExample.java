import java.util.Scanner;

public class StringCharAtExample {
    public static void main(String[] args) {
        System.out.println("주민등록번호를 입력하세요 >>");
        Scanner sc = new Scanner(System.in);
        String ssn = sc.next();
        char sex = ssn.charAt(7);
        switch (sex){
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
