package static2.ex;

public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car("K3");// 빨간줄에 대고 옵션+엔터 치면 알아서 만들어준다
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        Car.showTotalCars();    // 빨간줄에 대고 옵션+엔터 치면 알아서 만들어준다
    }
}
