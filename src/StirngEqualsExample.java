public class StirngEqualsExample{
    public static void main(String []args){
        String strVar1 = "윤창호";
        String strVar2 = "윤창호";
        String strVar3 = new String("윤창호");
        System.out.println(strVar1==strVar2);
        System.out.println(strVar1==strVar3);
        System.out.println();
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar1.equals(strVar3));


    }

}
