public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("파랑",3000);

        System.out.println("제작회사 : "+myCar.company);
        System.out.println("모델명 : "+myCar.model);
        System.out.println("색깔 : "+myCar.color);
        System.out.println("최고속도 : "+myCar.maxSpeed);
        System.out.println("현재속도 : "+myCar.speed);

        int curSpeed =myCar.speed = 50;
        System.out.println("내차의 현재 속도는 "+curSpeed+"km 입니다.");
        System.out.println("내차의 cc는 "+myCar.CC+"CC 입니다.");
    }
}
