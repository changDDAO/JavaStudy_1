package JavaStudy_1;

import java.util.Scanner;

public class SwitchCharExample {
    public static void main(String[] args) {
        System.out.print("등급을 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        String grade = sc.next();
        switch (grade) {
            case "A":
            case "a":
                System.out.println("우수회원 입니다");
                break;
            case "B":
            case "b":
                System.out.println("일반회원 입니다.");
                break;
            case "C":
            case "c":
                System.out.println("손님 입니다.");
                break;
        }

    }
}
