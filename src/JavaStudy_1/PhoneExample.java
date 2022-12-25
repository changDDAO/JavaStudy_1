package JavaStudy_1;

public class PhoneExample {
    public static void main(String[] args) {
        //JavaStudy_1.Phone phone = new JavaStudy_1.Phone(); abstract class라 객체 생성 불가능.
        SmartPhone smartPhone = new SmartPhone("윤창호");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}
