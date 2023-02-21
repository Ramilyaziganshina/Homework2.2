public class Truck extends Transport implements TransportABC, TransportBC {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
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