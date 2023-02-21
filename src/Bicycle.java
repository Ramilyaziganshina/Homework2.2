public class Bicycle implements AllTransport {

    private final String modelName;
    private final int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String getModelName() { // т.к. все поля для каждого вида транспорта одинаковые,
        // их геттеры можно объединить в один интерфейс
        return modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void updateTyre() { // этот метод тоже одинаковый для всех,
        // поэтому его я тоже объединила в тот же интерфейс
        System.out.println("Меняем покрышку");
    }
}