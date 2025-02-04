package extends1.overriding;

public class ElectricCar extends Car {  // 부모(자동차)의 기능을 다 물려받음

    @Override   // 아 나 부모 기능 맘에 안들어 내가 재정의할래
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
