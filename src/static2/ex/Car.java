package static2.ex;

public class Car {
    private static int totalCars;
    private String name;

    public Car(String name) { // 빨간줄에 대고 옵션+엔터 치면 알아서 만들어준다
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;

        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
