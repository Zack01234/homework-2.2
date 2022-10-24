package homework.dz2_2.part_2;

public abstract class Transport implements Repair {
    protected String modelName;
    protected int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        for (int i = 1; i <= wheelsCount; i++) {
            System.out.println("Меняем покрышку.");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public abstract void service();
}
