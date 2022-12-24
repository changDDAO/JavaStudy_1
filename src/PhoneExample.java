public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone(); abstract class라 객체 생성 불가능.
        SmartPhone smartPhone = new SmartPhone("윤창호");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}
