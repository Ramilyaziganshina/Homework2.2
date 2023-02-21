public class Car implements AllTransport, TransportBC {

    private final String modelName;
    private final int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
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