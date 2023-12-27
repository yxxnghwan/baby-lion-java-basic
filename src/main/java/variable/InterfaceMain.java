package variable;

public class InterfaceMain {

    // 자동차 경주 프로그램
    public static void main(String[] args) {
        final Car car = new Sonata(); // 고도의 추상화 도구

        car.drive(); // 추상화
        car.drive();

        final Sonata sonata = new Sonata();
        sonata.goToHyundaiCenter(); // 구체화

        final K5 k5 = new K5();
        k5.goToKiaCenter();

        driveToBusan(car);
        Vehicle vehicle = new Sonata();
        vehicle.ride();
    }

    public static void driveToBusan(Car car) {
        car.drive();
    }
}
