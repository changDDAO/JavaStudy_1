package JavaStudy_1;

public class Car {
    Tire frontLeftTire =new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire rearLeftTire = new HankookTire();
    Tire rearRightTire = new HankookTire();

    void run(){
        frontLeftTire.roll();
        frontRightTire.roll();
        rearLeftTire.roll();
        rearRightTire.roll();
    }
}
