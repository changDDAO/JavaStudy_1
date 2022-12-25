package JavaStudy_1;

import java.util.Arrays;
import java.util.Random;

public class LottoMachine {
    public static void main(String[] args) {

        int []selectNumber = new int[6];
        Random random = new Random(3);
        System.out.print("선택 번호 : ");

        for(int i= 0; i<6;i++){
            selectNumber[i]= random.nextInt(45)+1;
            System.out.print(selectNumber[i]+" ");
        }
        System.out.println();

        int[] winningNumber = new int[6];
        random = new Random(3);
        System.out.println("당첨 번호 : ");
        for(int i =0; i<6; i++){
            winningNumber[i]=random.nextInt(45)+1;
            System.out.print(winningNumber[i]+" ");

        }
        System.out.println();
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);
        int cnt =0;
        for(int i=0;i<6;i++){
            if(selectNumber[i]==winningNumber[i])
                cnt++;
        }
        switch (cnt){
            case 3:
                System.out.println("5000원 당첨입니다! 축하합니다.");
                break;
            case 4:
                System.out.println("50000원 당첨입니다! 축하합니다.");
                break;
            case 5:
                System.out.println("2등입니다 축하합니다.");
                break;
            case 6:
                System.out.println("1등 당첨입니다. 축하합니다");
                //seed를 동일한 값으로 주면 동일한 결과 무조건 1등
                break;

            default:
                System.out.println("이번 회차에는 당첨되지 않았습니다.");
                break;
                //기본적으로 seed 종자가 다르기 때문에 당첨될 수 없는조건
        }


    }
}
