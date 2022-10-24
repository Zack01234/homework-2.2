package homework.dz2_2.part_2;

public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {

    }

    @Override
    public void repair() {
        System.out.println("Обслуживаем " + this.modelName);
        this.updateTyre();
    }
}
