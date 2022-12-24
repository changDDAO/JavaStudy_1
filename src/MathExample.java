public class MathExample {
    public static void main(String[] args) {
        int v1 = Math.abs(-5);
        System.out.println("v1 = " + v1);
        double v2 = Math.abs(-3.14);
        System.out.println("v2 = " + v2);

        double v3 = Math.ceil(5.3);
        System.out.println("v3 = " + v3);
        double v4 = Math.floor(5.3);
        System.out.println("v4 = " + v4);

        int v7 = Math.max(5, 9);
        System.out.println("v7 = " + v7);

        int v9 = Math.min(5, 9);
        System.out.println("v9 = " + v9);
        
        //무작위 주사위 번호 뽑기
        int num = (int) (Math.random()*6)+1;
        System.out.println("num = " + num);
        
        //로또 번호 뽑기
        
        num = (int) (Math.random()*45)+1;
        System.out.println("num = " + num);
        



    }
}
