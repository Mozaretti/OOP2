package OOP2;

public abstract class KolesoTransport implements Transport {
    private final String modelName;
    private final int wheelsCount;

    public KolesoTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
}
}


