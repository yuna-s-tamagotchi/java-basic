package extends1.ex2;

public class ElectricCar extends Car {  // 부모(자동차)의 기능을 다 물려받음
    public void charge() {
        System.out.println("충전합니다.");
    }
}
