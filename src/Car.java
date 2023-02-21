public class Car extends Transport implements TransportABC, TransportBC {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() { // этот метод одинаковый только для класса Car и Truck,
        // поэтому для него я создала еще один отдельный интерфейс
        System.out.println("Проверяем двигатель");
    }
}