public class Truck implements AllTransport, TransportBC {

    private final String modelName;
    private final int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
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
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() { // этот метод применяется только в этом классе,
        // для него создавать еще один интерфейс нет необходимости
        System.out.println("Проверяем прицеп");
    }
}