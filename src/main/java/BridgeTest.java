public class BridgeTest {//тест

    public static void main(String[] args) {
        AbstractCar sportAbstractCar = new SportCar(new SportEngine());
        sportAbstractCar.setEngine();
        System.out.println();
        AbstractCar unknownAbstractCar = new UnknownCar(new UnknownEngine());
        unknownAbstractCar.setEngine();
    }
}
