package JavaStudy_1;

public class ForSumFromTo100Example {
    public static void main(String[] args) {
        int sum =0;

        for(int i=1; i<=100; i++){
            sum=sum+i;
        }
        System.out.println("1부터 100까지의 합은 : "+sum +"입니다.");
    }
}
